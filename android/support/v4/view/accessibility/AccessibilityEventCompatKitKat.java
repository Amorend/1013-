package android.support.v4.view.accessibility;

import android.annotation.TargetApi;
import android.support.annotation.RequiresApi;
import android.view.accessibility.AccessibilityEvent;

@TargetApi(19)
@RequiresApi(19)
class AccessibilityEventCompatKitKat
{
  public static int getContentChangeTypes(AccessibilityEvent paramAccessibilityEvent)
  {
    return paramAccessibilityEvent.getContentChangeTypes();
  }
  
  public static void setContentChangeTypes(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    paramAccessibilityEvent.setContentChangeTypes(paramInt);
  }
}


/* Location:              C:\Users\12724\Desktop\classes-dex2jar.jar!\android\support\v4\view\accessibility\AccessibilityEventCompatKitKat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */