package com.sufugui.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1 = 0
        var operador = ""
        var count = 0

        zero.setOnClickListener{
            var visor = numatual.text.toString()
            numatual.text = "$visor" + 0
        }

        zero.setOnClickListener{
            var visor = numatual.text.toString()
            numatual.text = "$visor" + 0
        }

        um.setOnClickListener{
            var visor = numatual.text.toString()
            numatual.text = "$visor" + 1
        }

        dois.setOnClickListener{
            var visor = numatual.text.toString()
            numatual.text = "$visor" + 2
        }

        tres.setOnClickListener{
            var visor = numatual.text.toString()
            numatual.text = "$visor" + 3
        }

        quatro.setOnClickListener{
            var visor = numatual.text.toString()
            numatual.text = "$visor" + 4
        }

        cinco.setOnClickListener{
            var visor = numatual.text.toString()
            numatual.text = "$visor" + 5
        }

        seis.setOnClickListener{
            var visor = numatual.text.toString()
            numatual.text = "$visor" + 6
        }

        sete.setOnClickListener{
            var visor = numatual.text.toString()
            numatual.text = "$visor" + 7
        }

        oito.setOnClickListener{
            var visor = numatual.text.toString()
            numatual.text = "$visor" + 8
        }

        nove.setOnClickListener{
            var visor = numatual.text.toString()
            numatual.text = "$visor" + 9
        }

        mais.setOnClickListener{

            if(count == 1){
                var visor = numatual.text.toString()
                var trans = visor.toInt()
                var previa = trans + num1
                num1 = previa
                operacao.text = "$previa"
                numatual.text = ""
                operador = "+"

            } else {
                var visor = numatual.text.toString()
                var trans = visor.toInt()
                num1 = trans
                operacao.text = "$visor"
                numatual.text = ""
                operador = "+"
                count += 1
            }
        }

        menos.setOnClickListener{

            if(count == 1){
                var visor = numatual.text.toString()
                var trans = visor.toInt()
                var previa = num1 - trans
                num1 = previa
                operacao.text = "$previa"
                numatual.text = ""
                operador = "-"

            } else {
                var visor = numatual.text.toString()
                var trans = visor.toInt()
                num1 = trans
                operacao.text = "$visor"
                numatual.text = ""
                operador = "-"
                count += 1
            }
        }

        clear.setOnClickListener{
            numatual.text = ""
            operacao.text = ""
            num1 = 0
            count = 0
        }

        igual.setOnClickListener{
            var visor = numatual.text.toString()
            var trans = visor.toInt()
            var previa = num1
            var num2 = trans
            numatual.text = ""

            if(operador == "+"){
                var resultado = num1 + num2
                operacao.text = "$previa $operador $num2 = $resultado"
            }else{
                var resultado = num1 - num2
                operacao.text = "$previa $operador $num2 = $resultado"
            }
        }
    }
}