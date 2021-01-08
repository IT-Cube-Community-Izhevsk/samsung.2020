package ru.dpankratov.itcube.cell;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.GridLayout;

public class CellsActivity extends Activity implements OnClickListener,
        OnLongClickListener {

    private int WIDTH = 10;
    private int HEIGHT = 10;

    private Button[][] cells;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cells);
        makeCells();
        generate();
    }

    void generate() {
        //Эту строку нужно удалить
        Task.showMessage(this, "Добавьте код в функцию активности generate() для генерации клеточного поля");
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                //ADD YOUR CODE HERE
                //....
            }
        }
    }

    @Override
    public boolean onLongClick(View v) {
        //Эту строку нужно удалить
        Stub.show(this, "Добавьте код в функцию активности onLongClick() - реакцию на долгое нажатие на клетку");
        Button tappedCell = (Button) v; //привели тип нашего слоя , куда мы нажали к кнопке. которую создавали на этом месте.

        //Получаем координтаты нажатой клетки
        int tappedX = getX(tappedCell);
        int tappedY = getY(tappedCell);
        //ADD YOUR CODE HERE
        //....
        return false;
    }

    @Override
    public void onClick(View v) {
        //Эту строку нужно удалить
        Stub.show(this, "Добавьте код в функцию активности onClick() - реакцию на нажатие на клетку");

        Button tappedCell = (Button) v; //привели тип нашего слоя , куда мы нажали к кнопке. которую создавали на этом месте.

        //Получаем координтаты нажатой клетки
        int tappedX = getX(tappedCell);
        int tappedY = getY(tappedCell);
        for (int x = 0; x < WIDTH; x++)
        {
            cells[tappedY][x].setBackgroundColor(Color.RED);
        }
        for (int y = 0; y < WIDTH; y++)
        {
            cells[y][tappedX].setBackgroundColor(Color.RED);
        }
    }

    /*
     * NOT FOR THE BEGINNERS
     * ==================================================
     */

    int getX(View v) {
        return Integer.parseInt(((String) v.getTag()).split(",")[1]);
    }

    int getY(View v) {
        return Integer.parseInt(((String) v.getTag()).split(",")[0]);
    }

    void makeCells() {
        cells = new Button[HEIGHT][WIDTH]; //создаем массив нужной размерности
        GridLayout cellsLayout = (GridLayout) findViewById(R.id.CellsLayout); //вытаскиваем слой по уникальному номеру
        cellsLayout.removeAllViews(); //очищаем
        cellsLayout.setColumnCount(WIDTH); //количество колонок для грида
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                //СОЗДАЕМ КНОПКИ
                cells[i][j] = (Button) inflater.inflate(R.layout.cell, cellsLayout, false); //создаем кнопку на базе шаблона cell
                cells[i][j].setOnClickListener(this); //задаем реакцию на быстрое нажатие
                cells[i][j].setOnLongClickListener(this); //задаем реакцию на долгое нажатие
                cells[i][j].setTag(i + "," + j); //ставим метку на кнопку
                cellsLayout.addView(cells[i][j]); //Добавляем кнпку на слой для отображения.
                //Создали кнопки
            }
        }
    }

}