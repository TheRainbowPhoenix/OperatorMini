class C0004e {
  /** @type {number} */
  f75a;

  /** @type {int[]} */
  f76a = [];

  /** @type {Object[]}  */
  f77a = [];

  /** @type {Image[]}  */
  f78a = [];

  /** @type {boolean[]}  */
  f79a = [];

  /** @type {int}  */
  f80b;

  /**
   *
   * @param {C0019t} tVar
   */
  constructor(tVar) {}
}

class BitmapFont {
  static f1e = null;
  static f2f = null;

  /** @type {C0004e} */
  f5a = new C0004e(); // TODO !

  fontHeight;
  bmpWidth;
  bmpHeight;

  static async loadFontsCache() {
    const response = await fetch("assets/font_map");
    const raw_data = await response.arrayBuffer();
    const data = new Uint16Array(raw_data);
    BitmapFont.f1e = new Uint8Array(225);
    BitmapFont.f2f = new Uint8Array(225);
    let s = 0;
    for (let i = 0; i < 225; i++) {
      s = s + data[i];
      BitmapFont.f1e[i] = s & 0xff;
    }
    let s2 = 0;
    for (let i = 0; i < 225; i++) {
      s2 = s2 + data[i + 225];
      BitmapFont.f2f[i] = s2 & 0xff;
    }
  }

  async loadFontImage(name) {
    return new Promise((resolve, reject) => {
      let img = new Image();
      img.onload = () => resolve(img);
      img.onerror = reject;
      img.src = name;
    });
  }

  pushFontImage(a) {
    this.fontHeight = 11;
    this.bmpWidth = a.width;
    this.bmpHeight = a.height;

    this.f7a = new Array(this.f11c);

    for (let i3 = 0; i3 < this.f11c; i3++) {
      this.f7a[i3] = new C0004e(null);
    }

    this.f13d = 0;
    const iArr = new Array(this.bmpWidth * this.bmpHeight);
    const canvas = document.createElement("canvas");
    canvas.width = this.bmpWidth;
    canvas.height = this.bmpHeight;
    const context = canvas.getContext("2d");
    context.drawImage(a, 0, 0);
    // context
    //   .getImageData(0, 0, this.bmpWidth, this.bmpHeight)
    //   .data.forEach((value, i4) => {
    //     iArr[i4] = value;
    //   });

    const imageData = context.getImageData(0, 0, this.bmpWidth, this.bmpHeight);
    const pixels = [];
    for (let i = 0; i < imageData.data.length; i += 4) {
      const r = imageData.data[i],
        g = imageData.data[i + 1],
        b = imageData.data[i + 2],
        a = imageData.data[i + 3];

      // TODO: unsure about the order, doc say argb
      iArr[i / 4] = (a << 24) + (r << 16) + (g << 8) + b;
    }

    this.f14d = new Uint8Array(this.bmpWidth * this.bmpHeight);
    for (let i4 = 0; i4 < iArr.length; i4++) {
      // Look like it's stripping the alpha but touching the blue ?
      this.f14d[i4] = (7 - ((iArr[i4] & 255) >> 5)) & 0xff;
    }
    this.f10b = new Uint8Array(225);
    this.f12c = new Uint8Array(225);
    let b = 0,
      b2 = 0;

    for (let i5 = 0; i5 < 225; i5++) {
      if (this.f6a[i5] + b2 >= this.bmpWidth) {
        b = (b + 1) & 0xff;
        b2 = 0;
      }
      this.f10b[i5] = b2 & 0xff;
      this.f12c[i5] = b & 0xff;
      b2 = (b2 + this.f6a[i5]) & 0xff;
    }
    this.f6a[0] = (this.f6a[0] - this.f8b) & 0xff;
  }

  async createFonts(z) {
    let str;

    if (z) {
      str = "assets/sans80b.png";
      this.f6a = BitmapFont.f2f;
      this.f8b = 0;
      this.f11c = 4;
    } else {
      str = "assets/sans80r.png";
      this.f6a = BitmapFont.f1e;
      this.f8b = 1;
      this.f11c = 7;
    }

    const a = await this.loadFontImage(str);
    this.pushFontImage(a);
  }

  constructor(z) {}

  static convertCharToFontIndex(c) {
    if (c.charCodeAt(0) >= " ".charCodeAt(0) && c.charCodeAt(0) <= 255) {
      return String.fromCharCode(c.charCodeAt(0) - " ".charCodeAt(0));
    }
    switch (c.charCodeAt(0)) {
      case 8211:
        return "v";
      case 8212:
        return "w";
      case 8216:
        return "q";
      case 8217:
        return "r";
      case 8220:
        return "s";
      case 8221:
        return "t";
      case 8226:
        return "u";
      case 8230:
        return "e";
      default:
        return String.fromCharCode(224);
    }
  }

  async init(z) {
    if (!BitmapFont.f1e) {
      // Load font data from binary file
      await BitmapFont.loadFontsCache();
      await this.createFonts(z);
    } else {
      await this.createFonts(z);
    }
    return this;
  }

  mo1a(str) {
    return this.m1a(str, 0, str.length);
  }

  // Get String length ?
  m1a(str, start_index, str_len) {
    let size = 0;
    let max_size = start_index + str_len;
    if (max_size > str.length) {
      max_size = str.length;
    }
    while (start_index < max_size) {
      size +=
        this.f6a[
          BitmapFont.convertCharToFontIndex(str.charAt(start_index)).charCodeAt(
            0
          )
        ] + this.f8b;
      start_index++;
    }
    return size;
  }

  m2a(graphics, c, i, i2) {
    let a = BitmapFont.convertCharToFontIndex(c).charCodeAt(0);
    if (a !== 0) {
      if (!!this.f5a?.f78a?.length) {
        graphics.drawRegion(
          this.m3a(this.f12c[a]),
          this.f10b[a],
          0,
          this.f6a[a],
          this.fontHeight,
          0,
          i,
          i2,
          0
        );
      } else {
        graphics.drawRGB(
          this.m5a(this.f12c[a]),
          this.f10b[a],
          this.bmpWidth,
          i,
          i2,
          this.f6a[a],
          this.fontHeight,
          false
        );
      }
    }
    return this.f6a[a] + this.f8b;
  }

  m3a(b) {
    if (this.f5a.f78a[b] == null) {
      const i = this.bmpWidth * this.fontHeight;
      const i2 = b * i;
      const f0a = new Array(i);

      for (let i3 = 0; i3 < i; i3++) {
        f0a[i3] = this.f5a.f76a[this.f14d[i3 + i2]];
      }
      this.f5a.f78a[b] = new Image();
      this.f5a.f78a[b].src = "data:image/png;base64," + btoa(f0a.join(","));
    }

    return this.f5a.f78a[b];
  }

  m5a(b) {
    if (this.f5a?.f79a && this.f5a?.f79a[b]) {
      return this.f5a.f77a[b];
    }
    this.f5a.f79a[b] = true;
    var i = this.fontHeight * this.bmpWidth;
    var i2 = b * i;
    if (this.f5a.f77a[b] == null) {
      this.f5a.f77a[b] = new Array(this.bmpWidth * this.fontHeight);
    }
    var iArr = this.f5a.f77a[b];
    var iArr2 = this.f5a.f76a;
    for (var i3 = 0; i3 < i; i3++) {
      iArr[i3] = iArr2[this.f14d[i3 + i2]];
    }
  }
}
