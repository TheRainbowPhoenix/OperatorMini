package com.opera.android.browser.obml;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.opera.android.R;

/* compiled from: OperaSrc */
public class ObmlTextSelectionView extends ViewGroup implements View.OnTouchListener, doh, dzz {
    private static final int[] k = {16843461, 16843462};
    public don a;
    public ebd b;
    private dpj c;
    private final dpi d;
    private final dpi e;
    private boolean f;
    private float g;
    private float h;
    private final int[] i;
    private final int[] j;
    private final dpl l;
    private GestureDetector m;
    private ScaleGestureDetector n;
    private boolean o;
    private boolean p;
    private dog q;

    public static ObmlTextSelectionView a(dpo dpo, Context context, dpj dpj) {
        ObmlTextSelectionView obmlTextSelectionView = (ObmlTextSelectionView) LayoutInflater.from(context).inflate(R.layout.obml_popup_menu_text_selection, (ViewGroup) null);
        obmlTextSelectionView.c = dpj;
        obmlTextSelectionView.a = dpo.a;
        obmlTextSelectionView.q = obmlTextSelectionView.a.W();
        obmlTextSelectionView.h();
        obmlTextSelectionView.a.a(true, dpo.b, dpo.c);
        Context context2 = obmlTextSelectionView.getContext();
        obmlTextSelectionView.m = new GestureDetector(context2, new dph(obmlTextSelectionView, obmlTextSelectionView.q));
        obmlTextSelectionView.n = new gtw(context2, new dpk(obmlTextSelectionView, obmlTextSelectionView.q));
        obmlTextSelectionView.e();
        return obmlTextSelectionView;
    }

    public ObmlTextSelectionView(Context context) {
        super(context);
        this.d = new dpi(this, true);
        this.e = new dpi(this, false);
        this.i = new int[2];
        this.j = new int[2];
        this.l = new dpl(this);
        a(context);
    }

    public ObmlTextSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new dpi(this, true);
        this.e = new dpi(this, false);
        this.i = new int[2];
        this.j = new int[2];
        this.l = new dpl(this);
        a(context);
    }

    public ObmlTextSelectionView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = new dpi(this, true);
        this.e = new dpi(this, false);
        this.i = new int[2];
        this.j = new int[2];
        this.l = new dpl(this);
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(k);
        this.d.a(obtainStyledAttributes.getResourceId(obtainStyledAttributes.getIndex(0), 0));
        this.e.a(obtainStyledAttributes.getResourceId(obtainStyledAttributes.getIndex(1), 0));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.d.a((ImageView) findViewById(R.id.text_selection_start_knob));
        this.e.a((ImageView) findViewById(R.id.text_selection_end_knob));
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        dpi dpi;
        int id = view.getId();
        if (id == R.id.text_selection_start_knob) {
            dpi = this.d;
        } else if (id != R.id.text_selection_end_knob) {
            return false;
        } else {
            dpi = this.e;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.g = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f = true;
                f();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                break;
            case 1:
            case 3:
                if (this.f) {
                    c();
                    e();
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            case 2:
                dpi.e.getLocationOnScreen(this.i);
                float x = ((float) this.i[0]) + (motionEvent.getX() - this.g);
                float y = ((float) this.i[1]) + (motionEvent.getY() - this.h);
                if (this.f) {
                    a(dpi == this.d, x, y);
                    break;
                }
                break;
        }
        return true;
    }

    public final void c() {
        this.l.a();
        this.f = false;
    }

    private void e() {
        if (this.b != null) {
            this.b.a(true);
            requestLayout();
        }
    }

    private void f() {
        if (this.b != null) {
            this.b.a(false);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (g()) {
            getLocationOnScreen(this.j);
            this.d.a(this.j[0], this.j[1]);
            this.e.a(this.j[0], this.j[1]);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.d.a();
        this.e.a();
        if (this.b != null) {
            measureChild(this.b, i2, i3);
        }
    }

    @Override // defpackage.dzz
    public final Rect a() {
        int i2;
        int i3;
        int measuredHeight;
        g();
        int measuredWidth = this.d.e.getMeasuredWidth() + this.d.b[0];
        if (measuredWidth <= this.e.b[0]) {
            i2 = this.e.b[0];
        } else {
            measuredWidth = this.e.b[0];
            i2 = this.d.b[0];
        }
        if (this.d.b[1] <= this.e.b[1]) {
            i3 = this.d.b[1] - this.d.f;
            measuredHeight = this.e.b[1] + this.e.e.getMeasuredHeight();
        } else {
            i3 = this.e.b[1] - this.e.f;
            measuredHeight = this.d.b[1] + this.d.e.getMeasuredHeight();
        }
        return new Rect(measuredWidth, i3, i2, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (g()) {
            getLocationOnScreen(this.j);
            this.d.a(this.j[0], this.j[1]);
            this.e.a(this.j[0], this.j[1]);
        }
        if (this.b != null) {
            this.b.layout(i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z, float f2, float f3) {
        h();
        dpl dpl = this.l;
        dpl.d = z;
        dpl.e = (int) f2;
        dpl.f = (int) f3;
        if (!(!dpl.a.contains(dpl.e, dpl.f))) {
            dpl.a();
        } else if (!dpl.g) {
            dpl.g = true;
            dpl.h.postDelayed(dpl, 500);
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() + 500;
            dpl.c = currentAnimationTimeMillis;
            dpl.b = currentAnimationTimeMillis;
        }
        don don = this.a;
        don.b.c().getLocationOnScreen(don.w);
        int i2 = ((int) f2) + (don.l - don.w[0]);
        int i3 = ((int) f3) + (don.m - don.w[1]);
        don.w[0] = don.a(i2, i3, don.n);
        don.w[1] = don.b(i3, don.n);
        int[] iArr = don.w;
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z) {
            this.a.h(i4, i5);
        } else {
            this.a.i(i4, i5);
        }
        invalidate();
    }

    private boolean g() {
        if (!this.d.b() || !this.e.b()) {
            return false;
        }
        this.d.a(this.a.X());
        int[] iArr = this.d.b;
        iArr[0] = iArr[0] - this.d.e.getMeasuredWidth();
        this.e.a(this.a.Y());
        return true;
    }

    private void h() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.obml_text_selection_scroll_border);
        Rect rect = new Rect(0, 0, this.a.j, this.a.k);
        rect.inset(dimensionPixelSize, dimensionPixelSize);
        this.l.a = rect;
    }

    private void i() {
        e();
        this.d.c();
        this.e.c();
    }

    @Override // defpackage.doh
    public final void b() {
        if (!this.o) {
            i();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            f();
            this.d.d();
            this.e.d();
            this.o = true;
        }
        if (this.q == null || !this.q.c.a(motionEvent)) {
            this.m.onTouchEvent(motionEvent);
            this.n.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1) {
                this.o = false;
                if (this.q.b != null) {
                    z = true;
                }
                if (!z) {
                    i();
                }
            }
        }
        return true;
    }

    public final void d() {
        this.c.b();
    }
}