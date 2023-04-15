private void setupDocStructure(final RMSData rms_data, final boolean b, final boolean b2) throws IOException {
        final C0013n doc_parse;
        (doc_parse = new C0013n()).field_type = 'V';
        if (!b) {
            int i = 0;
            while (i == 0) {
                final C0013n sub_doc_parse;
                switch ((sub_doc_parse = rms_data.read_header()).field_type) {
                    case '0': {
						/*
						 int f468c = 0;
						 short f469c;
						 boolean f470c;
						 
						  int f250c, short f252c, boolean f253c
						*/
                        this.c = sub_doc_parse.c;
                        break;
                    }
                    case '1':
                    case '2':
                    case '3': {
                        i = 1;
                        break;
                    }
                }
                if (this.m288c()) {
                    return;
                }
            }
            this.a(5);   // private void a(final short n) throws IOException {   // public final void a(final int h) {
            rms_data.a();
            if (rms_data.l == 0) {
                this.o = false;
            }
            this.a(this.a = rms_data.a);
            this.a = rms_data.b;
            if (!this.d) {
                this.b(rms_data.c * 4);
            }
            if (!this.d) {
                this.a(6);
            }
            boolean a2 = false;
            for (int n2 = 0; n2 <= 3 && !(a2 = this.a(rms_data)); ++n2) {
                this.d();
                if (this.a != null) {
                    this.a.a(n2);
                }
            }
            if (!a2) {
                throw new OutOfMemoryError("OOM error caused by Document#setupDocStructure");
            }
            ((Canvas)this.browser_canvas).repaint();
            this.a = System.currentTimeMillis();
            if (!this.h && k.a) {
                this.m270a(doc_parse);
            }
        }
        while (rms_data.a) {
            C0013n a3;
            try {
                a3 = rms_data.a();
                if (this.c()) {
                    return;
                }
            }
            catch (final IOException ex) {
                if (this.t) {
                    k.i = -2;
                }
                k.b();
                if (this.a) {
                    this.a.b(k.a(44));
                }
                else if (ex instanceof EOFException) {
                    this.a.b(k.a(45));
                }
                else {
                    this.a.b(k.a(46));
                }
                break;
            }
            catch (final OutOfMemoryError outOfMemoryError) {
                this.a(9);
                continue;
            }
            if (a3.c && a3.a == 'T') {
                this.c(new String(a3.a, 0, a3.b));
            }
            else {
                if (a3.a == 'U') {
                    this.t = true;
                    if (a3.a == null) {
                        continue;
                    }
                    final int unsignedShort = a3.a.readUnsignedShort();
                    final int int1;
                    if ((int1 = a3.a.readInt()) < 1) {
                        break;
                    }
                    if (Runtime.getRuntime().freeMemory() < int1 * 2 && this.a != null) {
                        this.a.a(0);
                    }
                    try {
                        final byte[] array = new byte[int1];
                        final int read;
                        if ((read = a3.a.read(array)) != int1) {
                            break;
                        }
                        final RecordStore openRecordStore;
                        if ((openRecordStore = RecordStore.openRecordStore("d", (boolean)(1 != 0))).getSizeAvailable() < int1) {
                            break;
                        }
                        if (openRecordStore.getNextRecordID() > 1) {
                            openRecordStore.setRecord(1, array, 0, int1);
                        }
                        else {
                            openRecordStore.addRecord(array, 0, int1);
                        }
                        openRecordStore.closeRecordStore();
                        k.i = unsignedShort;
                        k.b();
                        continue;
                    }
                    catch (final Throwable t) {
                        final Object o;
                        if (o instanceof OutOfMemoryError && this.a != null) {
                            this.a.a(0);
                        }
                        k.i = -2;
                        k.b();
                        break;
                    }
                }
                if (a3.a == '-') {
                    continue;
                }
                try {
                    this.a(a3);
                }
                catch (final OutOfMemoryError outOfMemoryError2) {
                    if (this.a != null) {
                        this.a.a(0);
                    }
                    this.a(9);
                    break;
                }
                if (b2 || System.currentTimeMillis() - this.a <= 500L || this.d) {
                    continue;
                }
                this.o();
                this.a = System.currentTimeMillis();
            }
        }
        if (b2) {
            return;
        }
        if (!this.h) {
            this.m270a(doc_parse);
        }
        this.o();
        this.a[this.a + 1] = ((ByteArrayOutputStream)this.a).size();
        ((ByteArrayOutputStream)this.a).size();
        this.n();
    }