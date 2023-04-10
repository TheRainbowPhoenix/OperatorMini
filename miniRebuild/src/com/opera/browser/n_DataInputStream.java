package com.opera.browser;

import java.io.DataInputStream;

public class n_DataInputStream {
    public DataInputStream das; // a
    public char a_char = '-';
    public char b_char;
    public byte[] a_byte_arr;
    public int a_int;
    public char[] a_char_arr = new char[512];
    public int b_int;
    public short a_short;
    public short b_short;
    public String a_string;
    public String b_string;
    public int c_int;
    public int d_int;
    public int e_int;
    public String c_string;
    public int f_int;
    public String d_string;
    public String e_string;
    public String f_string;
    public boolean a_bool;
    public boolean b_bool;
    public short c_short;
    public boolean c_bool;

    public n_DataInputStream() {
    }

    public final void create() { // a
        this.das = null;
        this.a_char = '-';
        this.a_int = 0;
        this.a_byte_arr = null;
        this.a_char_arr = null;
        this.d_int = 0;
        this.e_int = 0;
        this.c_string = null;
        this.f_int = 0;
        this.d_string = null;
        this.e_string = null;
        this.f_string = null;
        this.c_short = 0;
        this.c_bool = false;
        this.a_bool = false;
        this.c_int = 0;
        this.b_int = 0;
        this.b_char = '-';
    }
}
