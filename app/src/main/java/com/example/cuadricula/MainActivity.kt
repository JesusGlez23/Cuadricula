package com.example.cuadricula

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var botones: List<Button>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            botones = listOf(
                findViewById(R.id.b1),
                findViewById(R.id.b2),
                findViewById(R.id.b3),
                findViewById(R.id.b4),
                findViewById(R.id.b5),
                findViewById(R.id.b6),
                findViewById(R.id.b7),
                findViewById(R.id.b8),
                findViewById(R.id.b9),
                findViewById(R.id.b10),
                findViewById(R.id.b11),
                findViewById(R.id.b12),
                findViewById(R.id.b13),
                findViewById(R.id.b14),
                findViewById(R.id.b15),
                findViewById(R.id.b16),
                findViewById(R.id.b17),
                findViewById(R.id.b18),
                findViewById(R.id.b19),
                findViewById(R.id.b20),
                findViewById(R.id.b21),
                findViewById(R.id.b22),
                findViewById(R.id.b23),
                findViewById(R.id.b24),
                findViewById(R.id.b25)
            )

            // Configuramos el clic para cada botón
            for (boton in botones) {
                boton.setOnClickListener {
                    val numAleatorio = Random.nextInt(1, 101) // Número entre 1 y 100
                    boton.text = numAleatorio.toString()
                }
            }

            // Botón "Regenerar" -> vuelve a poner aleatorios en todos
            val btnRegenerar = findViewById<Button>(R.id.Btnreg)
            btnRegenerar.setOnClickListener {
                for (boton in botones) {
                    val numAleatorio = Random.nextInt(1, 101)
                    boton.text = numAleatorio.toString()
                }
            }

            // Botón "Limpiar" -> borra todos los números
            val btnLimpiar = findViewById<Button>(R.id.Btnlimp)
            btnLimpiar.setOnClickListener {
                for (boton in botones) {
                    boton.text = ""
                }
            }
        }
    }
