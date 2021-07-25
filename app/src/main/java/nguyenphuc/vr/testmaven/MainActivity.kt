package nguyenphuc.vr.testmaven

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import nguyenphuc.vr.helloworld.HelloWorld

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var helloWorld: HelloWorld = HelloWorld()
        helloWorld.printlnHellWorld()
    }
}