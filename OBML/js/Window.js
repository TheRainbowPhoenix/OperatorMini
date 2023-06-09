currentLocale = undefined;

class BytesDataView extends DataView {
  byteOffset = 0;
  endianess = false;

  constructor(buffer, byteOffset, byteLength) {
    super(buffer, byteOffset, byteLength);
  }

  get_buffer() {
    return this.buffer;
  }

  seek(index) {
    let old = this.byteOffset;
    this.byteOffset = index;
    return old;
  }

  readUnsignedByte() {
    const value = super.getUint8(this.byteOffset);
    this.byteOffset += 1;
    return value;
  }

  readByte() {
    const value = super.getUint8(this.byteOffset);
    this.byteOffset += 1;
    return value;
  }

  readInt() {
    const value = super.getUint32(this.byteOffset, this.endianess);
    this.byteOffset += 4;
    return value;
  }

  readUnsignedShort() {
    const value = super.getUint16(this.byteOffset, this.endianess);
    this.byteOffset += 2;
    return value;
  }

  readInt8() {
    const value = super.getInt8(this.byteOffset);
    this.byteOffset += 1;
    return value;
  }

  write(value) {
    super.setUint8(this.byteOffset, value);
    this.byteOffset += 1;
  }

  readInt16() {
    const value = super.getInt16(this.byteOffset, this.endianess);
    this.byteOffset += 2;
    return value;
  }

  writeByte(value) {
    super.setUint8(this.byteOffset, value);
    this.byteOffset += 1;
  }

  writeShort(value) {
    super.setUint16(this.byteOffset, value, this.endianess);
    this.byteOffset += 2;
  }

  writeInt(value) {
    super.setUint32(this.byteOffset, value, this.endianess);
    this.byteOffset += 4;
  }

  writeLong(value) {
    super.setBigUint64(this.byteOffset, value, this.endianess);
    this.byteOffset += 8;
  }

  writeFloat(value) {
    super.setFloat32(this.byteOffset, value, this.endianess);
    this.byteOffset += 4;
  }

  writeDouble(value) {
    super.setFloat64(this.byteOffset, value, this.endianess);
    this.byteOffset += 8;
  }

  /** @param {String} text */
  writeUTF(text) {
    this.writeShort(text.length);

    const utf8encoder = new TextEncoder();
    /** @type {Uint8Array} */
    const utf8Bytes = utf8encoder.encode(text);

    for (let index = 0; index < utf8Bytes.length; index++) {
      this.write(utf8Bytes[index]);
    }
  }

  readUTF() {
    return this.readUTFString();
  }

  readUTFString() {
    const length = this.readInt16(this.byteOffset, false);

    const stringBytes = new Uint8Array(this.buffer, this.byteOffset, length);

    this.byteOffset += length;
    return new TextDecoder().decode(stringBytes);
  }
}

class DrawingUtils {
  static f185g = 0;
  static f148L = false;
  static f193j = 0;
  static f195k = 0;

  static m95a(i, i2, i3, i4, i5, i6, i7, i8) {
    return i + i3 >= i5 && i2 + i4 >= i6 && i5 + i7 >= i && i6 + i8 >= i2;
  }

  static translations_res;

  static makeGradient(ctx, x1, y1, width, height, color1, color2) {
    ctx.save();
    var r1 = (color1 >> 16) & 0xff;
    var g1 = (color1 >> 8) & 0xff;
    var b1 = color1 & 0xff;
    var r2 = (color2 >> 16) & 0xff;
    var g2 = (color2 >> 8) & 0xff;
    var b2 = color2 & 0xff;
    r1 <<= 8;
    g1 <<= 8;
    b1 <<= 8;
    r2 <<= 8;
    g2 <<= 8;
    b2 <<= 8;
    var dr = (r2 - r1) / height;
    var dg = (g2 - g1) / height;
    var db = (b2 - b1) / height;
    var x2 = x1 + width - 1;
    var y2 = y1 + height - 1;

    for (var y = y1; y < y2; ++y) {
      ctx.strokeStyle =
        "rgb(" + (r1 >> 8) + "," + (g1 >> 8) + "," + (b1 >> 8) + ")";
      ctx.beginPath();
      ctx.moveTo(x1, y);
      ctx.lineTo(x2, y);
      ctx.stroke();
      r1 += dr;
      g1 += dg;
      b1 += db;
    }
    ctx.restore();
  }

  static m85a(graphics, font, str, i, i2, i3, i4, z) {
    if (!DrawingUtils.f148L || z) {
      graphics.setFont(font);
      graphics.drawString(str, i, DrawingUtils.f193j + i2, i3);
      return;
    }
    console.log("TODO this.m60a(font).mo4a (font load + drawing)");
    // this.m60a(font).mo4a(graphics, str, i, i2, i3, i4);
  }

  static m73a(font, z) {
    return !DrawingUtils.f148L || z
      ? font.getHeight() + DrawingUtils.f193j + DrawingUtils.f195k
      : DrawingUtils.m60a(font).mo3a();
  }

  static m60a(font) {
    console.log("TODO this.m60a(font) (font load + drawing)");
    return {
      mo3a: () => {
        console.log("TODO: mo3a");
      },
    };
  }

  static init_string_resources() {
    const dataView = new BytesDataView(languages_map);

    if (3 === dataView.readInt16()) {
      const numLocales = dataView.readInt8();
      const localeCodes = new Array(numLocales);
      const localeNames = new Array(numLocales);
      let currentLocaleIndex = -1;

      for (let i = 0; i < numLocales; i++) {
        const localeCode = dataView.readUTFString();
        if (currentLocale != null && localeCode.startsWith(currentLocale)) {
          currentLocale = localeCode;
          currentLocaleIndex = i;
        }
        localeCodes[i] = localeCode;
      }

      let defaultLocaleIndex = -1;
      if (currentLocaleIndex === -1) {
        currentLocale = localeCodes[0];
        defaultLocaleIndex = 0;
      } else {
        defaultLocaleIndex = currentLocaleIndex;
      }

      const numTranslations = dataView.readInt16() - 1;
      const translationResources = new Array(numTranslations);

      for (let i = 0; i < numLocales; i++) {
        localeNames[i] = dataView.readUTFString();
        for (let j = 0; j < numTranslations; j++) {
          const translationResource = dataView.readUTFString();
          if (i === defaultLocaleIndex) {
            translationResources[j] = translationResource;
          }
        }
      }
      return translationResources;
    }
  }

  static get_string_resource(id) {
    if (!DrawingUtils.translations_res) {
      DrawingUtils.translations_res = DrawingUtils.init_string_resources();
    }
    return DrawingUtils.translations_res[id];
  }

  static;
}

class Graphics {
  static HCENTER = 1;
  static VCENTER = 2;
  static LEFT = 4;
  static RIGHT = 8;
  static TOP = 16;
  static BOTTOM = 32;
  static BASELINE = 64;

  ctx;
  clip = {
    x: 0,
    y: 0,
    width: 0,
    height: 0,
  };
  color = "#000000";

  constructor(ctx) {
    this.ctx = ctx;
  }

  drawImage(image, x, y, anchor) {
    let lx;
    let ly;

    if ((anchor & Graphics.RIGHT) != 0) {
      lx = x - image.width;
    } else if ((anchor & Graphics.HCENTER) != 0) {
      lx = x - image.width / 2.0;
    } else {
      lx = x;
    }

    if ((anchor & Graphics.BOTTOM) != 0) {
      ly = y - image.height;
    } else if ((anchor & Graphics.VCENTER) != 0) {
      ly = y - image.height / 2.0;
    } else {
      ly = y;
    }

    this.ctx.drawImage(image, lx, ly);
  }
  drawImageRegion(image, sx, sy, sw, sh, dx, dy, dw, dh) {
    if (dw && dh) {
      this.ctx.drawImage(image, sx, sy, sw, sh, dx, dy, dw, dh);
    } else {
      this.ctx.drawImage(image, sx, sy, sw, sh, dx, dy);
    }
  }
  drawRect(x, y, width, height) {
    this.ctx.fillRect(x, y, width, height);
  }

  drawRGB(rgbData, offset, scanlength, x, y, width, height, processAlpha) {
    var imageData = this.ctx.createImageData(width, height);
    var data = imageData.data;
    var i, j, k;
    var alpha;

    for (i = 0, k = 0; i < height; i++) {
      for (j = 0; j < width; j++, k += 4) {
        if (processAlpha) {
          alpha = (rgbData[offset + i * scanlength + j] >> 24) & 0xff;
        } else {
          alpha = 0xff;
        }

        data[k] = (rgbData[offset + i * scanlength + j] >> 16) & 0xff; // red
        data[k + 1] = (rgbData[offset + i * scanlength + j] >> 8) & 0xff; // green
        data[k + 2] = rgbData[offset + i * scanlength + j] & 0xff; // blue
        data[k + 3] = alpha;
      }
    }

    this.ctx.putImageData(imageData, x, y);
  }

  setClip(x, y, width, height) {
    this.clip.x = x;
    this.clip.y = y;
    this.clip.width = width;
    this.clip.height = height;
    // this.ctx.beginPath();
    // this.ctx.rect(x, y, width, height);
    // this.ctx.clip();
  }

  getClipX() {
    return this.clip.x || this.ctx.getTransform().e;
  }

  getClipY() {
    return this.clip.y || this.ctx.getTransform().f;
  }

  getClipWidth() {
    return this.clip.width || this.ctx.canvas.width;
  }

  getClipHeight() {
    return this.clip.height || this.ctx.canvas.height;
  }
  setColor(color) {
    this.color = color;
    this.ctx.fillStyle = "#" + color.toString(16).padStart(6, "0");
    this.ctx.strokeStyle = "#" + color.toString(16).padStart(6, "0");
  }

  getColor() {
    return this.color; // parseInt(this.ctx.fillStyle.slice(1), 16);
  }

  fillRect(x, y, width, height) {
    this.ctx.save();
    this.ctx.fillStyle = this.getColor();
    this.ctx.fillRect(x, y, width, height);
    this.ctx.restore();
  }

  drawLine(x1, y1, x2, y2) {
    this.ctx.save();
    this.ctx.beginPath();
    this.ctx.strokeStyle = this.getColor();
    this.ctx.moveTo(x1, y1);
    this.ctx.lineTo(x2, y2);
    this.ctx.stroke();
    this.ctx.restore();
  }

  setFont(font) {
    console.log("TODO: handle fonts");
  }

  drawChars(data, offset, length, x, y, anchor) {
    // TODO
  }

  drawString(text, x, y, anchor) {
    if ((anchor & Graphics.RIGHT) != 0) {
      this.ctx.textAlign = "right";
    } else if ((anchor & Graphics.HCENTER) != 0) {
      this.ctx.textBaseline = "top";
    } else {
      this.ctx.textAlign = "left";
    }

    this.ctx.font = "11px sans-serif";
    console.log("TODO: draw string - " + text + ` x:${x}, y:${y}, a:${anchor}`);
    this.ctx.fillText(text, x, y + 11);
  }
}

class SearchUI /* extends Canvas implements CommandListener, Runnable */ {
  f414e = false;
  f398c = 18; // TOP Offset ?
  f388b = 10;

  f372s; // Command
  f354e; // Command

  f397b = Array.from(
    { length: this.f398c },
    (_, i) =>
      "#" + ("0".repeat(2) + (110 + i * 2).toString(16)).slice(-2) + "0B0B"
  ); // TODO: auto-generated gradient

  window = new WindowApp();

  f348b = ""; // TODO
  static f345a = {
    name: "TODO FONT ",
    getHeight: () => {
      return 11;
    },
  }; // FONT

  // TODO
  f430t = { f342a: false, getLabel: () => "get Label todo" };
  f431u = { f342a: false, getLabel: () => "get Label todo", f343b: 42 };

  getHeight() {
    // TODO
    return this.window.height;
  }

  getWidth() {
    // TODO
    return this.window.width;
  }
  /**
   *
   * @param {Graphics} graphics
   */
  paint(graphics) {
    if (!!this.window) {
      this.window.y = 0;
      if (this.f414e) {
        this.window.y = this.f398c;
        if (graphics.getClipY() < this.f398c) {
          this.window.f317d = false;
          this.m200a(graphics); // TODO : this.palet ref ?
        }
      }
      let height = this.getHeight() - this.window.y;
      if (this.mo67b()) {
        height -= this.f388b;
        if (
          graphics.getClipY() + graphics.getClipHeight() >
          this.getHeight() - this.f388b
        ) {
          this.drawFooterNavGradient(graphics);
        }
      }
      this.window.m174a(height);

      this.window.paint(graphics);
    }
  }

  mo67b() {
    return (
      this.f409d ||
      this.f429l ||
      this.window.m188c() ||
      (this.window.document != null && this.window.document.f498i)
    );
  }

  m200a(graphics) {
    // TODO
  }

  /**
   *
   * @param {Graphics} graphics
   */
  drawFooterNavGradient(graphics) {
    let height = this.getHeight() - this.f388b;
    let width = this.getWidth();
    let i = this.f388b;
    let clipX = graphics.getClipX();
    let clipY = graphics.getClipY();
    let clipWidth = graphics.getClipWidth();
    let clipHeight = graphics.getClipHeight();
    let i2 = i - this.f398c;
    graphics.setColor(skin_colors[26]);
    graphics.drawLine(0, height, width - 1, height);
    if (i2 > 0) {
      graphics.setColor(this.f397b[0]);
      graphics.fillRect(0, height + 1, this.getWidth(), i2);
    } else if (i2 < 0) {
      i2 = 0;
    }
    let i3 = i2 + 1;
    for (let i4 = 0; i4 < this.f398c; i4++) {
      graphics.setColor(this.f397b[i4]);
      graphics.drawLine(0, height + i4 + i3, width - 1, height + i4 + i3);
    }
    let i5 = this.window.width;
    if (this.window.m188c()) {
      this.f430t = this.f372s;
      this.f431u = this.f354e;
      this.m202a(
        graphics,
        0,
        this.getHeight() - this.f388b,
        i5 - (this.f431u.f343b + 6),
        this.f388b
      );
    } else if (DrawingUtils.f149M) {
      let i6 = this.f430t.f343b;
      let i7 = this.f431u.f343b;
      let a = DrawingUtils.m56a(f348b, this.f376a, true);
      if (i6 + a / 2 + 1 < width / 2 && a / 2 + i7 + 1 < width / 2) {
        graphics.setColor(skin_colors[1]);
        DrawingUtils.m85a(
          graphics,
          this.f348b,
          this.f376a,
          width / 2,
          height + 2,
          17,
          0,
          true
        );
      }
    }
    if (this.f430t.f342a) {
      DrawingUtils.drawOnScreenSelection(
        graphics,
        0,
        height,
        this.f430t.f343b,
        this.f388b,
        false
      );
    } else if (this.f431u.f342a) {
      DrawingUtils.drawOnScreenSelection(
        graphics,
        width + 0 - this.f431u.f343b - 6,
        height,
        this.f431u.f343b + 6,
        this.f388b,
        false
      );
    }
    graphics.setClip(
      clipX,
      clipY,
      clipWidth,
      Math.min(height + i - 1 - clipY, clipHeight)
    );
    graphics.setColor(this.f430t.f342a ? skin_colors[2] : skin_colors[1]);
    DrawingUtils.m85a(
      graphics,
      SearchUI.f345a,
      this.f430t.getLabel(),
      2,
      height + 2,
      20,
      0,
      true
    );
    graphics.setColor(this.f431u.f342a ? skin_colors[2] : skin_colors[1]);
    DrawingUtils.m85a(
      graphics,
      SearchUI.f345a,
      this.f431u.getLabel(),
      width + 0 - this.f431u.f343b,
      height + 2,
      20,
      0,
      true
    );
    graphics.setClip(clipX, clipY, clipWidth, clipHeight);
  }

  m202a(graphics, i, i2, i3, i4) {
    let a = "";
    /** @type {PageDataRunnable} */
    let uVar = this.window.f311b;

    if (this.window.m188c() && uVar != null) {
      graphics.setColor(skin_colors[26]);
      graphics.drawRect(i, i2, i3 - 1, i4);
      let i5 = i + 1;
      let i6 = i2 + 1;
      let i7 = i3 - 2;
      let i8 = i4 - 1;
      let a2 = uVar.m328a();
      let b = uVar.m343b();
      let i9 = a2 != 0 ? (i7 * b) / a2 : 0;
      let i10 = skin_colors[27];
      let i11 = (i10 >> 16) & 255;
      let i12 = 0;
      let i13 = i10 & 255;
      let i14 = (i10 >> 8) & 255;
      while (i12 < i8) {
        graphics.setColor(i11, i14, i13);
        graphics.drawLine(i5, i6 + i12, i5 + i9, i6 + i12);
        let i15 = i11 - i12;
        let i16 = i14 - i12;
        let i17 = i13 - i12;
        if (i15 < 0 || i16 < 0 || i17 < 0) {
          i15 = 0;
          i16 = 0;
          i17 = 0;
        }
        i12++;
        i13 = i17;
        i14 = i16;
        i11 = i15;
      }
      let i18 = i7 - i9;
      DrawingUtils.makeGradient(
        graphics,
        i5 + i9,
        i6,
        i7 - i9,
        i8 + 1,
        skin_colors[29],
        skin_colors[30]
      );
      if (i18 >= 1) {
        graphics.setColor(skin_colors[21]);
        graphics.drawLine(i5 + i9, i6, i5 + i9, i6 + i8 - 1);
      }
      if (i18 >= 2) {
        graphics.setColor(skin_colors[22]);
        graphics.drawLine(i5 + i9 + 1, i6, i5 + i9 + 1, i6 + i8 - 1);
        graphics.drawLine(i5 + i9 + 1, i6, i7, i6);
      }
      if (i18 >= 3) {
        graphics.setColor(skin_colors[23]);
        graphics.drawLine(i5 + i9 + 2, i6 + 1, i5 + i9 + 2, i6 + i8 - 1);
        graphics.drawLine(i5 + i9 + 2, i6 + 1, i7, i6 + 1);
      }
      graphics.setColor(skin_colors[28]);
      if (this.f377a == null) {
        this.f377a = new StringBuffer();
      }
      this.f377a.delete(0, this.f377a.length());
      let c = 1;
      if (!f362j) {
        switch (uVar.f494h) {
          case 1:
            a = DrawingUtils.m62a(21);
            if (DrawingUtils.f196k) {
              a = DrawingUtils.m62a(23);
              break;
            }
            break;
          case 2:
            a = DrawingUtils.m62a(22);
            if (DrawingUtils.f196k) {
              a = DrawingUtils.m62a(23);
              break;
            }
            break;
          case 3:
            a = DrawingUtils.m62a(23);
            break;
          case 4:
          default:
            a = "";
            break;
          case 5:
          case 6:
            a = DrawingUtils.m62a(24);
            c = 2;
            break;
        }
      } else {
        a = DrawingUtils.m62a(107);
      }
      this.f377a.append(a);
      let a3 = DrawingUtils.m56a(f348b, this.f377a.toString(), true);
      if (c == 1) {
        let currentTimeMillis =
          int((System.currentTimeMillis() - this.window.f301a) / 500) % 4;
        for (let i19 = 0; i19 < currentTimeMillis; i19++) {
          this.f377a.append(".");
        }
      } else if (c == 2 && a2 > 0) {
        this.f377a.append(" ");
        this.f377a.append(b / 1024);
        this.f377a.append("/");
        this.f377a.append(a2 / 1024);
        this.f377a.append(" kB");
      }
      stringBuffer = this.f377a.toString();
      let a4 = DrawingUtils.m56a(f348b, stringBuffer, true);
      if (c == 2) {
        a3 = a4;
      }
      if (a4 > i7) {
        this.f377a.delete(0, a.length());
        if (c != 1) {
          this.f377a.insert(0, "...");
        }
        stringBuffer2 = this.f377a.toString();
        let a5 = DrawingUtils.m56a(f348b, stringBuffer2, true);
        let clipX = graphics.getClipX();
        let clipY = graphics.getClipY();
        let clipWidth = graphics.getClipWidth();
        let clipHeight = graphics.getClipHeight();
        graphics.setClip(
          clipX,
          clipY,
          Math.min(clipWidth, i7 - a5 - clipX),
          clipHeight
        );
        DrawingUtils.m84a(
          graphics,
          f348b,
          a,
          i5,
          i6 + 1,
          20,
          0,
          i9,
          16777215,
          true
        );
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
        DrawingUtils.m84a(
          graphics,
          f348b,
          stringBuffer2,
          i7,
          i6 + 1,
          24,
          0,
          i9,
          16777215,
          true
        );
        return;
      }
      DrawingUtils.m84a(
        graphics,
        f348b,
        stringBuffer,
        i7 / 2 + i5 - a3 / 2,
        i6 + 1,
        20,
        0,
        i9,
        16777215,
        true
      );
    }
  }
}

class WindowApp {
  document = new ODocument();

  f311b; // another ODocument

  f293B = -1;
  f319e;

  progress = 100;
  isVisible = false;
  offset = 10;

  x = 0;
  y = 0;
  width = 240;
  height = 300;

  f308b = -1;
  f300a = -1;
  f296E; // int

  f312b = false;

  f314c = {
    removeAllElements: () => {
      console.log("TODO removeAllElements");
    },
  };

  /**
   *
   * @param {Graphics} graphics
   */
  paint(graphics) {
    let clipX = graphics.getClipX();
    let clipY = graphics.getClipY();
    let clipWidth = graphics.getClipWidth();
    let clipHeight = graphics.getClipHeight();
    let i = clipX + clipWidth;
    let i2 = clipY + clipHeight;

    try {
      let max = Math.max(clipX, this.x);
      let max2 = Math.max(this.y, clipY);
      let min = Math.min(i, this.width + this.x);
      let min2 = Math.min(i2, this.height + this.y);
      if (max < min && max2 < min2) {
        graphics.setClip(max, max2, min - max, min2 - max2);
        this.drawBG(graphics);
        if (
          this.f315c &&
          this.f324h > 1 &&
          this.document != null &&
          this.document.width > this.height &&
          ((this.f326i == f289k && DrawingUtils.f144H) || this.f326i == f290l)
        ) {
          if (
            this.document.f466b[this.f324h - 1] >
            this.document.width - this.height
          ) {
            this.offset = this.height - this.document.width;
          } else {
            this.offset = -this.document.f466b[this.f324h - 1];
          }
          this.f315c = false;
          this.f324h = -1;
          this.f300a = -1;
          this.f320f = -2;
        } else if (
          this.f315c &&
          this.f326i == f291m &&
          this.document != null &&
          this.document.f472c != null
        ) {
          this.offset = this.f318e;
          this.f315c = false;
        }
        this.drawProgressBar(graphics);
        if (
          this.document != null &&
          (this.document.f496h ||
            (this.document.m351c() != null &&
              this.document.m351c().equals("opera:alert")))
        ) {
          this.f317d = false;
        } else if (
          this.f317d &&
          this.f298G == this.offset &&
          this.f299H == this.f300a
        ) {
          this.f317d = true;
        } else {
          this.f317d = false;
        }
        // this.m163c(graphics);
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
      }
    } catch (th) {
      throw th;
      //   throw new Error("OOM error in Window#paint.");
    } finally {
      graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }
  }

  /**
   *
   * @param {Graphics} graphics
   */
  m163c(graphics) {
    if (
      !(
        this.document == null ||
        this.document.f453a == null ||
        this.document.f460a == null ||
        this.document.f466b == null ||
        graphics == null ||
        this.document.f451a <= 0 ||
        this.f317d
      )
    ) {
      console.log("INSIDE");
      let clipX = graphics.getClipX();
      let clipY = graphics.getClipY();
      let clipWidth = graphics.getClipWidth();
      let clipHeight = graphics.getClipHeight();
      if (this.document.width > this.height) {
        if (
          DrawingUtils.m95a(
            clipX,
            clipY,
            clipWidth,
            clipHeight,
            this.width - 6,
            0,
            6,
            this.height
          )
        ) {
          clipWidth = this.x + this.width - clipX - 6;
        }
        if (this.offset > 0) {
          this.offset = 0;
        } else if (this.offset < this.height - this.document.width) {
          this.offset = this.height - this.document.width;
        }
      }

      let c = this.document.m350c(this.offset - (clipY - this.y));
      let c2 = this.document.m350c(this.offset - (clipY - this.y) - clipHeight);
      if (c != -1) {
        let s = c2 == -1 ? this.document.f451a : c2;
        let i = this.offset + 0;
        if (c > 0) {
          i += this.document.f466b[c - 1];
        }
        this.f314c.removeAllElements();
        if (this.f300a == -1) {
          this.m183b(this.mo40a());
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
        let i2 = i + this.y;
        for (let i3 = c; i3 <= s; i3++) {
          this.m151a(graphics, i3, this.x, i2, false, false);
          i2 += this.document.f460a[i3];
        }
        if (i2 < clipHeight + clipY) {
          graphics.setColor(16777215);
          graphics.fillRect(0, i2, this.width, clipY + clipHeight - i2);
        }
        if (i2 > this.height) {
          this.f317d = true;
          this.f298G = this.offset;
          this.f299H = this.f300a;
        }
        if (!(this.f336v == 0 || this.document.f465b || this.f296E == -1)) {
          let max = Math.max(c, this.document.f485e[this.f296E]);
          let min = Math.min(s, this.document.f490f[this.f296E]);
          let i4 = this.offset + this.y;
          let i5 = max > 0 ? i4 + this.document.f466b[max - 1] : i4;
          let i6 = i5;
          for (let i7 = max; i7 <= min; i7++) {
            this.m151a(graphics, i7, this.x, i6, true, true);
            i6 += this.document.f460a[i7];
          }
          let i8 = i5;
          for (let i9 = max; i9 <= min; i9++) {
            this.m151a(graphics, i9, this.x, i8, true, false);
            i8 += this.document.f460a[i9];
          }
        }
      }
    }
    // TODO
    console.log("TODO");
  }
  /**
   *
   * @param {Graphics} graphics
   */
  drawBG(graphics) {
    if (
      (this.document != null &&
        graphics != null &&
        this.f312b &&
        !this.document.f500j) ||
      (this.document == null && graphics != null && this.f312b)
    ) {
      const clipX = graphics.getClipX();
      const clipY = graphics.getClipY();
      const clipWidth = graphics.getClipWidth();
      const clipHeight = graphics.getClipHeight();
      graphics.setClip(this.x, this.y, this.width, this.height);
      const color = graphics.getColor();
      graphics.setColor(0xffffff);
      graphics.fillRect(this.x, this.y, this.width, this.height);
      graphics.setColor(color);
      graphics.setClip(clipX, clipY, clipWidth, clipHeight);
      this.f317d = false;
    }
    this.f312b = false;
  }

  /**
   *
   * @param {Graphics} graphics
   */
  drawProgressBar(graphics) {
    if (
      this.document == null ||
      this.document.width <= this.height ||
      this.document.width <= 0
    ) {
      this.isVisible = false;
      return;
    }
    this.isVisible = true;
    let color = graphics.getColor();
    let clipX = graphics.getClipX();
    let clipY = graphics.getClipY();
    let i = this.height;
    let max = Math.max(clipX, this.width + this.x - 6);
    let max2 = Math.max(clipY, this.y);
    let i2 = i - 2;
    let i3 = (((i * 1024) / this.document.width) * i2) / 1024 + 3;
    let min =
      Math.abs(this.offset) + this.height >= this.document.width
        ? i2 - i3 + 1
        : Math.min(
            (((Math.abs(this.offset) * 1024) / this.document.width) * i) / 1024,
            i2 - i3 + 1
          );

    graphics.setColor(SKIN_COLORS[16]);
    graphics.drawLine(max, max2, max, max2 + i - 1);
    graphics.drawLine(max + 6 - 1, max2, max + 6 - 1, max2 + i - 1);
    let iArr = [0, 0, 0, 0];
    iArr[0] = SKIN_COLORS[21];
    iArr[1] = SKIN_COLORS[22];
    iArr[2] = SKIN_COLORS[23];
    iArr[3] = SKIN_COLORS[24];
    for (let i4 = 0; i4 < 4; i4++) {
      graphics.setColor(iArr[i4]);
      graphics.drawLine(max + 1 + i4, max2, max + 1 + i4, max2 + i - 1);
    }
    let i5 = max + 1;
    let i6 = this.y + min;
    let i7 = i5 + 3;
    let max3 = this.y + min + Math.max(i3, 4);
    graphics.setColor(SKIN_COLORS[16]);
    graphics.drawLine(i5 - 1, i6, i7 + 1 + DrawingUtils.f185g, i6);
    graphics.drawLine(i5 - 1, max3, i7 + 1, max3);
    graphics.setColor(SKIN_COLORS[17]);
    graphics.drawLine(i5, i6 + 1, i5, max3 - 1);
    graphics.drawLine(i5, i6 + 1, DrawingUtils.f185g + i7, i6 + 1);
    graphics.setColor(SKIN_COLORS[18]);
    graphics.drawLine(i5 + 1, max3 - 1, DrawingUtils.f185g + i7, max3 - 1);
    graphics.drawLine(i7, max3 - 1, i7, i6 + 2);
    graphics.setColor(SKIN_COLORS[19]);
    graphics.drawLine(i5 + 1, i6 + 2, i5 + 1, max3 - 2);
    graphics.drawLine(i5 + 1, i6 + 2, i5 + 2 + DrawingUtils.f185g, i6 + 2);
    graphics.setColor(SKIN_COLORS[20]);
    graphics.drawLine(i5 + 2, i6 + 3, i5 + 2, max3 - 2);
    graphics.setColor(color);
    this.barWidth = i3;
    this.barOffset = min;
  }

  /**
   *
   * @param {Graphics} graphics
   *
   */
  m151a(graphics, i, i2, i3, z, z2) {
    let cVar; // C0002c
    console.log("TODO m151a");

    if (
      this.document != null &&
      this.document.f453a != null &&
      this.document.f454a != null
    ) {
      let cVar2 = null; // C0002c
      let i4 = this.document.f454a[i];
      // TODO
    }
  }

  m183b(i) {
    this.f308b = this.f300a;
    this.f300a = i;
    if (this.document != null) {
      this.f296E = this.document.m353d(this.f300a);
    }
  }

  mo40a() {
    if (this.document == null || this.document.f454a == null) {
      return -1;
    }
    let c = this.document.m350c(this.offset);
    if (c >= this.document.f454a.length || c < 0) {
      return -1;
    }
    if (
      this.document.f466b[c] - this.document.f460a[c] >= -this.offset ||
      (c = c + 1) < this.document.f454a.length
    ) {
      return this.document.mo93a(
        this.document.f454a[c] - 1,
        this.f336v,
        this.document.f488f,
        true
      );
    }
    return -1;
  }

  m188c() {
    return (
      this.f311b != null &&
      (this.f311b.f494h == 1 ||
        this.f311b.f494h == 2 ||
        this.f311b.f494h == 3 ||
        this.f311b.f494h == 5 ||
        this.f311b.f494h == 6)
    );
  }

  m174a(i) {
    if (i != this.height) {
      this.height = i;
      this.f337w = this.height / 8;
      this.f338x = this.height / 4;
      this.f339y = this.height - DrawingUtils.m73a(SearchUI.f345a, false) - 4;
    }
  }

  /**
   *
   * @param {Graphics} graphics
   * @param {number} i
   * @param {number} i2
   * @param {number} i3
   * @param {boolean} z
   * @param {boolean} z2
   */
  process_doc_bytecode(graphics, i, i2, i3, z, z2) {
    let loop = true;

    if (
      this.document != null &&
      this.document.doc_bytecode != null /* && this.document.f454a != null */
    ) {
      let i5 = i2; /* + this.f329o + this.document.f467b[i]*/

      let cVar;

      let reader = new BytesDataView(
        this.document.doc_bytecode,
        0,
        this.document.doc_bytecode.byteLength
      );
      /* let i4 = this.document.f454a[i]; */
      // start = 0x2A, can't guess what's the header for before that (for now)
      let i6 = 0x2a;
      reader.seek(i6);
      while (loop) {
        // let c = this.document.doc_bytecode[i6];
        let c = reader.readByte();
        let i7 = i6 + 1;
        // m164d(i7);
        switch (String.fromCharCode(c)) {
          case "B":
            i6 = i7;
            // cVar = cVar2;
            break;

          case "T":
            let text = reader.readUTFString();
            console.log(text);
            // let i14 = this.document.doc_bytecode[i7] & 255;
            // let i15 = i7 + 1;
            // let a8 = font_size...
            let a7 = text.length;
            let a8 = 11;
            /*
              graphics.setFont(cVar2.lcd_font);
              graphics.setColor(cVar2.f64a);
            */
            let i17 = i3; /* =i3 + ((this.document.f460a[i] - a8) / 2); */
            let i14 = a7 * 10; // = DrawingUtils.m57a(cVar2.lcd_font, f286a, 0, a7, this.document.f492g);

            // } else if (this.document.m356e(this.f300a) == 6) {
            graphics.setColor(SKIN_COLORS[11]);
            graphics.fillRect(i5 - 1, i17, i14 + 2, a8);
            graphics.setColor(SKIN_COLORS[12]);
            // } else {
            // graphics.setColor(SKIN_COLORS[10]);
            // graphics.fillRect(i5 - 1, i17, i14 + 2, a8);
            // graphics.setColor(SKIN_COLORS[12]);
            // }
            // if (!DrawingUtils.use_bitmap_font || this.document.f492g) {
            // graphics.drawChars(text, 0, a7, i5, i17 + DrawingUtils.f193j, 20);
            // //                (data, offset, length, x, y, anchor)
            graphics.drawString(text, i5, i17 + DrawingUtils.f193j, 20);
            // } else {
            // DrawingUtils.m60a(cVar2.lcd_font).mo6a(graphics, f286a, 0, a7, i5, i17, this.f335u);
            // }

            // let a6 = DrawingUtils.m74a(this.document.doc_bytecode, i15);

            // if element has pointerEvent ?
            i5 += i14;
            break;

          case "V":
            break;

          case "Y":
            let font_id = reader.readByte();
            // cVar = this.document.page_fonts[font_id];
            break;

          case "L":
            this.f293B = i7 - 1;
            // Add Click Handler
            //  m148a(i5 - this.f329o, i3, this.width, this.document.f460a[i], this.f293B);
            // i6 = this.readUnsignedShort();

            // let i12 = i5; /* - this.f329o */
            // let i13 = this.width;
            // DrawingUtils.makeGradient(
            //   graphics.ctx,
            //   i12,
            //   i3,
            //   i13,
            //   this.document.height /* this.document.f460a[i] */,
            //   SKIN_COLORS[7],
            //   SKIN_COLORS[8]
            // );
            break;

          case "E":
            this.f319e = false;
            this.f293B = -1;
            i6 = i7;
            // cVar = cVar2;
            break;

          case "Q":
            i6 = i7;
            // cVar = cVar2;
            break;

          default:
            console.log(`UNKW ByteCode : ${String.fromCharCode(c)} (${c})`);
            loop = false;
            debugger;
            break;
        }
      }
    }
  }
}
