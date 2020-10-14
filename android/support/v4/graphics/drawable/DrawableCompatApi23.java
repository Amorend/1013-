package android.support.v4.graphics.drawable;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.support.annotation.RequiresApi;

@TargetApi(23)
@RequiresApi(23)
class DrawableCompatApi23
{
  public static int getLayoutDirection(Drawable paramDrawable)
  {
    return paramDrawable.getLayoutDirection();
  }
  
  public static boolean setLayoutDirection(Drawable paramDrawable, int paramInt)
  {
    return paramDrawable.setLayoutDirection(paramInt);
  }
}


/* Location:              C:\Users\12724\Desktop\classes-dex2jar.jar!\android\support\v4\graphics\drawable\DrawableCompatApi23.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */