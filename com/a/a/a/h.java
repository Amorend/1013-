package com.a.a.a;

import android.view.MotionEvent;

public class h
  extends g
{
  private static int f = 16;
  private int e;
  private float g = 0.0F;
  private float h = 0.0F;
  
  public h(c paramc)
  {
    super(paramc);
    f = this.c.a() * 2;
  }
  
  private void a(float paramFloat1, float paramFloat2)
  {
    if (((this.g < 0.0F) && (paramFloat1 > 0.0F)) || ((this.g > 0.0F) && (paramFloat1 < 0.0F))) {
      this.g = 0.0F;
    }
    if (((this.h < 0.0F) && (paramFloat2 > 0.0F)) || ((this.h > 0.0F) && (paramFloat2 < 0.0F))) {
      this.h = 0.0F;
    }
    double d = Math.atan2(Math.abs(paramFloat1), Math.abs(paramFloat2));
    int i;
    int j;
    if (d >= 0.322D)
    {
      paramFloat1 = this.g + paramFloat1;
      i = (int)paramFloat1 / f;
      this.g = (paramFloat1 - f * i);
      for (;;)
      {
        j = i;
        if (i <= 0) {
          break;
        }
        this.c.moveCaretRight();
        j = i - 1;
        i = j;
        if (this.e == 0)
        {
          this.e = 1;
          i = j;
        }
      }
      while (j < 0)
      {
        this.c.moveCaretLeft();
        i = j + 1;
        j = i;
        if (this.e == 0)
        {
          this.e = 1;
          j = i;
        }
      }
    }
    if (1.5707963267948966D - d >= 0.322D)
    {
      paramFloat1 = this.h + paramFloat2;
      i = (int)paramFloat1 / f;
      this.h = (paramFloat1 - f * i);
      j = i;
      int k;
      for (;;)
      {
        k = i;
        if (j <= 0) {
          break;
        }
        this.c.moveCaretDown();
        if (this.e == 0) {
          this.e = -1;
        }
        j -= 1;
      }
      while (k < 0)
      {
        this.c.moveCaretUp();
        if (this.e == 0) {
          this.e = -1;
        }
        k += 1;
      }
    }
  }
  
  public boolean a(MotionEvent paramMotionEvent)
  {
    this.g = 0.0F;
    this.h = 0.0F;
    this.e = 0;
    super.a(paramMotionEvent);
    return true;
  }
  
  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    this.c.setSelected(this.c.isSelectText() ^ true);
    this.c.setSelectionRange(this.c.getCaretPosition(), 0);
    return true;
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    this.e = 0;
    f = this.c.a() * 2;
    return true;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    a(paramMotionEvent2);
    return true;
  }
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    this.c.setSelected(this.c.isSelectText() ^ true);
    this.c.setSelectionRange(this.c.getCaretPosition(), 0);
  }
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    float f1;
    if (this.e == 1)
    {
      f1 = 0.0F;
    }
    else
    {
      f1 = paramFloat2;
      if (this.e == -1)
      {
        paramFloat1 = 0.0F;
        f1 = paramFloat2;
      }
    }
    a(-paramFloat1, -f1);
    if ((paramMotionEvent2.getAction() & 0xFF) == 1) {
      a(paramMotionEvent2);
    }
    return true;
  }
  
  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    return super.onSingleTapConfirmed(paramMotionEvent);
  }
}


/* Location:              C:\Users\12724\Desktop\classes-dex2jar.jar!\com\a\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */