package ru.dpankratov.itcube.cell;

import android.content.Context;
import android.widget.Toast;

public class Stub {
      public static void show(Context context, String message)
      {
    	  Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG); // создаем всплывающее окно
    	  toast.show(); //и показываем его
      }
      
}
