package nguyenphuc.vr.testmaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nguyenphuc.vr.helloworld.HelloWorld

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var helloWorld: HelloWorld = HelloWorld()
        helloWorld.printlnHellWorld()
    }
}