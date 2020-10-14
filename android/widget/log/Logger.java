package android.widget.log;

public interface Logger
{
  public abstract int d(String paramString1, String paramString2);
  
  public abstract int d(String paramString1, String paramString2, Throwable paramThrowable);
  
  public abstract int e(String paramString1, String paramString2);
  
  public abstract int e(String paramString1, String paramString2, Throwable paramThrowable);
  
  public abstract int i(String paramString1, String paramString2);
  
  public abstract int i(String paramString1, String paramString2, Throwable paramThrowable);
  
  public abstract int v(String paramString1, String paramString2);
  
  public abstract int v(String paramString1, String paramString2, Throwable paramThrowable);
  
  public abstract int w(String paramString1, String paramString2);
  
  public abstract int w(String paramString1, String paramString2, Throwable paramThrowable);
}


/* Location:              C:\Users\12724\Desktop\classes-dex2jar.jar!\android\widget\log\Logger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */