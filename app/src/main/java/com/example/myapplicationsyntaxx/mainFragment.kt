import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplicationsyntaxx.R
import com.example.myapplicationsyntaxx.databinding.FragmentMainBinding



class mainFragment : Fragment() {
     private lateinit var binding: FragmentMainBinding


 override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View { binding = FragmentMainBinding.inflate(inflater, container, false)
     return binding.root }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.secondFragment)
            Log.d("mainFragment", "Speichern Button geklickt!")
        }
    }
}