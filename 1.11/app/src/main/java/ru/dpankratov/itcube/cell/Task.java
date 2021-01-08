package ru.dpankratov.itcube.cell;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class Task {
      public static void showMessage(Context context, String message)
      {
    	  AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(context); // создаем создателя диалогового алерта
    	  dlgAlert.setMessage(message); //устанавливаем сообщение в диалог
    	  dlgAlert.setTitle("Задание"); //устанавлиаем название окна
    	  //dlgAlert.setPositiveButton("OK", null); //ставим кнопку
    	  dlgAlert.setCancelable(true); //говорим что окно можно отменить
    	  dlgAlert.setPositiveButton("Ok", //ставим кнопку
    			    new DialogInterface.OnClickListener() {
    			        public void onClick(DialogInterface dialog, int which) {
    			          //должна быть логика работы кнопки
    			        }
    			    });
    	  dlgAlert.create().show(); //показывает диалоговое окно.
      }
}
