class RMSData {
  /** @type {BytesDataView} */
  data_is;
  first_byte;
  buff_size;
  images_count;
  forms_count;
  f231g;
  f233i;
  f235k;
  f229e;
  f234j;
  f232h;
  f216a;
  f236l;
  f236l;
  f220a;
  docParserData = new DocumentParserData();
  chunk;

  /**
   *
   * @param {BytesDataView} dos
   * @param {boolean} read_first_byte
   */
  constructor(dos, read_first_byte) {
    this.data_is = dos;
    if (read_first_byte) {
      this.first_byte = this.data_is.readByte();
    }
  }
  read_header() {
    this.buff_size = this.data_is.readInt();
    this.images_count = this.data_is.readUnsignedShort();
    this.data_is.readUnsignedShort();
    this.forms_count = this.data_is.readUnsignedShort();
    this.f231g = this.data_is.readUnsignedShort();
    this.data_is.readUnsignedShort();
    this.data_is.readInt();
    this.f233i = this.data_is.readUnsignedShort();
    this.f235k = this.data_is.readUnsignedShort();
    this.f229e = this.data_is.readUnsignedShort();
    this.data_is.readUnsignedShort();
    this.f234j = this.data_is.readUnsignedShort();
    if (this.first_byte > 4) {
      this.f232h = this.data_is.readUnsignedShort();
    }
    if (this.first_byte > 5) {
      this.f216a = this.data_is.readByte();
    }
    if (this.first_byte > 12) {
      this.f236l = this.data_is.readUnsignedShort();
    } else {
      this.f236l = 65535;
    }
    if (this.first_byte > 19) {
      this.data_is.readUnsignedShort();
    }
    this.f220a = this.data_is.readUTF();
  }

  read_UTF() {
    // let rus = this.data_is.readUnsignedShort();
    // this.data_is.readFully(this.temp_bytes_buff, 0, rus);
    this.docParserData.chunk = this.data_is.readUTF();
  }

  // public final DocumentParserData parse()
  parse() {
    this.docParserData.create();
    let rub = this.data_is.readUnsignedByte();
    this.docParserData.field_type = rub;
    this.docParserData.data_is = this.data_is;
    switch (String.fromCharCode(rub)) {
      case "+":
        this.parse();
        this.docParserData.sub_doc = true;
        break;

      case "L":
      case "P":
      case "T":
      case "W":
      case "m":
        this.docParserData.temp_string = this.read_UTF();
        break;

      // case "Y":
      //   let font_id = this.data_is.readByte();
      //   // cVar /* current_font */ = document.page_fonts[font_id]
      //   break;

      default:
        break;
    }
  }
}

class DocumentParserData {
  field_type = "-";
  /** @type {DataInputStream} */
  data_is;
  /** @type {boolean} */
  sub_doc;

  constructor() {}

  create() {}
}

class ODocument {
  /** @type {BytesDataView} */
  page_dos;
  buffered_byteArrOutStream;
  doc_bytecode;

  f525y = 0;

  width = 500;
  f453a = "";
  f460a = [0, 0, 0, 0, 0, 0, 0, 0, , 0, 0, 0]; // TODO: STUB
  f466b = [0, 0, 0, 0, 0, 0, 0]; // TODO: STUB
  f451a = 1;

  f498i = false;

  f472c = [];
  f478d;

  m351c() {
    return null;
  }

  m350c(i) {
    let i2 = 0;
    let abs = Math.abs(i);
    for (let i3 = 0; i3 <= this.f451a; i3++) {
      i2 = this.f466b[i3];
      if (abs >= i2 && abs <= i2) {
        return i3;
      }
    }
    return -1;
  }

  m353d(i) {
    if (this.f453a == null || i < 0 || i > this.f453a.length) {
      return -1;
    }
    return this.m249a(this.f472c, this.f469c, i);
  }

  m249a(iArr, i, i2) {
    let i3 = -1;
    while (i - i3 > 1) {
      let i4 = (i + i3) / 2;
      if (iArr[i4] > i2) {
        i = i4;
      } else {
        i3 = i4;
      }
    }
    if (i3 == -1 || iArr[i3] != i2) {
      return -1;
    }
    return i3;
  }

  mo93a(i, i2, z, z2) {
    if (this.f478d == null) {
      return -1;
    }
    let length = this.f472c.length;
    for (let b = 0; b < length; b++) {
      let i3 = this.f472c[b];
      if ((this.f484e[b] & i2) != 0 && i3 > i && (!z2 || b >= this.f436a)) {
        return i3;
      }
    }
    if (z) {
      return this.mo93a(0, i2, false, z2);
    }
    return -1;
  }

  being_dos(z) {
    let i = 30;
    this.buffered_byteArrOutStream = new ArrayBuffer(6000);
    this.page_dos = new BytesDataView(this.buffered_byteArrOutStream);
    this.page_dos.write(13);
    this.page_dos.write(51);
    this.page_dos.writeInt(10000);
    this.page_dos.writeInt(3000);

    if (z) {
      this.page_dos.writeShort(30);
      this.page_dos.writeShort(0);
      this.page_dos.writeShort(0);
      this.page_dos.writeShort(20);
      this.page_dos.writeShort(3000);
      this.page_dos.writeInt(15000);
      this.page_dos.writeShort(20);
    } else {
      /* 
        if (no_favs) { load_favs() }
      */
      let a = "0/http://www.opera.com/mini/";
      if (a === "opera:bookmarks") {
        // i = DrawingUtils.bookmarks_vect.size();
      }
      let i2 = a == "opera:settings" ? 25 : 20;

      this.page_dos.writeShort(i);
      this.page_dos.writeShort(5);
      this.page_dos.writeShort(i2);
      this.page_dos.writeShort(i);
      this.page_dos.writeShort(3000);
      this.page_dos.writeInt(15000);
      this.page_dos.writeShort(200);
    }

    this.page_dos.writeShort(1);
    this.page_dos.writeShort(1);
    this.page_dos.writeShort(0);
    this.page_dos.writeShort(0);
    this.page_dos.writeShort(0);
    this.page_dos.write(0);
    this.page_dos.writeShort(0);
    this.page_dos.writeShort(0);

    console.log(this.page_dos);
  }

  write_dos_val(val) {
    this.page_dos.write(val);
  }

  /**
   *
   * @param {String} text
   */
  set_dialog_title(text) {
    this.write_dos_val(43);
    this.page_dos.write(84);
    this.page_dos.writeUTF(text);
  }

  m300f() {
    // Separator ?
    this.write_dos_val(66);
  }

  m262a(str, i, i2, i3, i4) {
    let a;
    console.log("TODO: DrawingUtils.loadResourceByName");
    // let a = DrawingUtils.loadResourceByName(str);
    if (a !== undefined) {
      this.page_dos.write(73);
      this.page_dos.writeShort(i);
      this.page_dos.writeShort(i2);
      this.page_dos.writeShort(i3);
      this.page_dos.writeShort(0);
      this.page_dos.writeByte(i4);
      for (let i5 = 0; i5 < i3; i5++) {
        this.page_dos.write(a.read());
      }
    }
  }

  write_dos_image(str, i, i2, i3) {
    this.m262a(str, i, i2, i3, 0);
  }

  set_transmit_stats() {}

  write_dos_string(str, i) {
    this.page_dos.write(89);
    this.page_dos.write(this.f525y + i);
    this.page_dos.write(84);
    if (str == null) {
      str = "null";
    }
    this.page_dos.writeUTF(str);
  }

  write_dos_link(name, val) {
    this.write_dos_val(76);
    this.write_dos_string(name);
    this.write_dos_string(val, 7);
    this.write_dos_val(69);
  }

  flush_dos_to_rms() {
    this.write_dos_val(81);
    return new RMSData(
      new BytesDataView(this.page_dos.buffer, 0, this.page_dos.byteOffset),
      true
    );
  }

  flush_bytecode() {
    this.doc_bytecode = this.page_dos.get_buffer();
  }

  /* about_dialog_maybe */
  about_dialog() {
    this.being_dos(false);
    this.set_dialog_title(DrawingUtils.get_string_resource(2));
    this.m300f();
    // if (this.browser_canvas.display.numColors() > 2) {
    this.write_dos_image("/om100.png", 98, 24, 745);
    // }
    this.m300f();
    this.write_dos_val(86);
    this.write_dos_string(
      "Opera Mini hifi norrisbrage us v. 1.2.2960, built 20060124",
      0
    );
    this.write_dos_string(
      " (microedition.configuration, microedition.profiles, current_platform)",
      0
    );
    this.m300f();
    this.write_dos_val(86);
    this.write_dos_string("Copyright (c) 2005-2006 ", 0);
    this.write_dos_link("http://www.opera.com/", "Opera Software ASA ");
    this.write_dos_string(". All rights reserved.", 0);
    this.m300f();

    this.write_dos_val(86);
    this.write_dos_string(
      "This product includes TinyLine software (GZIP decoder) developed by Andrew Girow. ",
      0
    );
    this.write_dos_link("http://www.tinyline.com/", "http://www.tinyline.com/");
    this.m300f();
    // if (DrawingUtils.use_custom_proxy) {
    this.write_dos_string("Proxy URL: 0.0.0.0", 0);
    this.m300f();
    // }
    this.write_dos_val(86);

    this.set_transmit_stats();
    this.m300f();

    return this.flush_dos_to_rms();
  }

  /**
   *
   * @param {RMSData} doc
   * @param {boolean} f477d
   */
  render_rms(doc, f477d) {
    if (doc == null) {
      console.log("doc is null");
    } else {
      this.setupDocStructure(doc, false, false);
    }
  }

  /**
   *
   * @param {RMSData} doc
   * @param {boolean} b
   * @param {boolean} b2
   */
  setupDocStructure(doc, b, b2) {
    let doc_parse = new DocumentParserData();
    doc_parse.field_type = "V";
    if (!b) {
      let i = 0;
      while (i == 0) {
        let sub_doc_parse = doc.read_header();
        console.log(sub_doc_parse);
        debugger;

        switch (sub_doc_parse.field_type) {
          case "0":
            console.log("this.c = sub_doc_parse.c ??", sub_doc_parse);
            break;

          case "1":
          case "1":
          case "3":
            i = 1;
            break;
        }
      }
    }
  }
}
