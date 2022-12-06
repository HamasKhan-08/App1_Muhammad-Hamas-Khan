package com.example.beveragemaker

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val dropdownlist1 = arrayOf("Cold Milk", "Warm Milk")
    val dropdownlist2 = arrayOf("Cappucino", "Strawberry", "Chocolate", "Vanilla", "Caramel", "Tea", "Green Tea")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist1)
        val adapter2=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist2)

        var b1=findViewById(R.id.button) as Button

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        Selection1.adapter=adapter
        Selection1.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long)
            {
                if(Selection1.selectedItemPosition==0)
                {
                    textView1.setText(" "+Selection1.selectedItem)
                }
                if(Selection1.selectedItemPosition==1)
                {
                    textView1.setText(" "+Selection1.selectedItem)
                }
            }
        }

        Selection2.adapter=adapter2
        Selection2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long)
            {
                if(Selection2.selectedItemPosition==0)
                {
                    textView2.setText(" "+Selection2.selectedItem)
                }
                if(Selection2.selectedItemPosition==1)
                {
                    textView2.setText(" "+Selection2.selectedItem)
                }
                if(Selection2.selectedItemPosition==2)
                {
                    textView2.setText(" "+Selection2.selectedItem)
                }
                if(Selection2.selectedItemPosition==3)
                {
                    textView2.setText(" "+Selection2.selectedItem)
                }
                if(Selection2.selectedItemPosition==4)
                {
                    textView2.setText(" "+Selection2.selectedItem)
                }
                if(Selection2.selectedItemPosition==5)
                {
                    textView2.setText(" "+Selection2.selectedItem)
                }
                if(Selection2.selectedItemPosition==6)
                {
                    textView2.setText(" "+Selection2.selectedItem)
                }

            }
        }

        b1.setOnClickListener {
            if(Selection1.selectedItemPosition==0 && Selection2.selectedItemPosition==0)
            {
                textView3.setText("The Result Is: Iced Cappucino Coffee")
            }
            if(Selection1.selectedItemPosition==0 && Selection2.selectedItemPosition==1)
            {
                textView3.setText("The Result Is: Chilled Strawberry Milkshake")
            }
            if(Selection1.selectedItemPosition==0 && Selection2.selectedItemPosition==2)
            {
                textView3.setText("The Result Is: Chilled Chocolate Milkshake")
            }
            if(Selection1.selectedItemPosition==0 && Selection2.selectedItemPosition==3)
            {
                textView3.setText("The Result Is: Iced Vanilla Latte")
            }
            if(Selection1.selectedItemPosition==0 && Selection2.selectedItemPosition==4)
            {
                textView3.setText("The Result Is: Iced Caramel Latte")
            }
            if(Selection1.selectedItemPosition==0 && Selection2.selectedItemPosition==5)
            {
                textView3.setText("The Result Is: Ice Tea")
            }
            if(Selection1.selectedItemPosition==0 && Selection2.selectedItemPosition==6)
            {
                textView3.setText("The Result Is: Iced Green Tea")
            }
            if(Selection1.selectedItemPosition==1 && Selection2.selectedItemPosition==0)
            {
                textView3.setText("The Result Is: Cappucino Latte")
            }
            if(Selection1.selectedItemPosition==1 && Selection2.selectedItemPosition==1)
            {
                textView3.setText("The Result Is: Strawberry Milk")
            }
            if(Selection1.selectedItemPosition==1 && Selection2.selectedItemPosition==2)
            {
                textView3.setText("The Result Is: Hot Chocolate")
            }
            if(Selection1.selectedItemPosition==1 && Selection2.selectedItemPosition==3)
            {
                textView3.setText("The Result Is: Warm Vanilla Latte")
            }
            if(Selection1.selectedItemPosition==1 && Selection2.selectedItemPosition==4)
            {
                textView3.setText("The Result Is: Warm Caramel Latte")
            }
            if(Selection1.selectedItemPosition==1 && Selection2.selectedItemPosition==5)
            {
                textView3.setText("The Result Is: Tea (AKA Shai Karak)")
            }
            if(Selection1.selectedItemPosition==1 && Selection2.selectedItemPosition==6)
            {
                textView3.setText("The Result Is: Green Tea")
            }


        }

    }
}