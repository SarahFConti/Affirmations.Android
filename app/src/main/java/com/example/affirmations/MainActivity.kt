package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Inicializar dados.Crie uma instância
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.Recycler_View)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use esta configuração para melhorar o desempenho se você souber que as mudanças
        //no conteúdo, não altere o tamanho do layout do RecyclerView
        recyclerView.setHasFixedSize(true)

    }

}