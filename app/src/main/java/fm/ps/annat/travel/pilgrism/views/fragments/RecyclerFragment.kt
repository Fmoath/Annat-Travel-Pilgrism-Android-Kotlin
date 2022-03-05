package fm.ps.annat.travel.pilgrism.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fm.ps.annat.travel.pilgrism.R
import fm.ps.annat.travel.pilgrism.databinding.FragmentRecyclerBinding
import kotlin.properties.Delegates

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/3/2022
 * @InTheHour : 09 : 29 : 23
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class RecyclerFragment() : BaseFragment() , View.OnLayoutChangeListener {

    //==============================================================================================
    // Constructor ...
    constructor(type: Int) : this() {
        this.type = type
    }

    constructor(type: Int, id: String ) : this() {
        this.type = type
        this.id = id
    }

    //==============================================================================================
    // Binding ...
    private lateinit var binding: FragmentRecyclerBinding

    //==============================================================================================
    // View Model ...

    //==============================================================================================
    // interfaces ...

    //==============================================================================================
    // Arrays List ...
//    private val servicesCategories: ArrayList<ServiceCategory> = ArrayList<ServiceCategory>()

    //==============================================================================================
    // Adapter ...
//    private lateinit var servicesCategoriesInHomeFragmentRecyclerAdapter: ServicesCategoriesInHomeFragmentRecyclerAdapter

    //==============================================================================================
    // Variable ...
    private lateinit var id: String
    private var type by Delegates.notNull<Int>()

    //==============================================================================================
    // On Create Fragment  ...
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recycler, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeFragment()
    }

    //==============================================================================================
    // Initialize Fragment ...
    private fun initializeFragment() {
        initializeView()
        listener()
    }

    private fun initializeView() {
        setRecycler()
    }

    //==============================================================================================
    // Listener ...
    private fun listener() {
        binding.fragmentRecycler.addOnLayoutChangeListener( this )
    }

    override fun onLayoutChange(p0: View?, left: Int, top: Int, right: Int, bottom: Int, oldLeft: Int, oldTop: Int, oldRight: Int, oldBottom: Int) {
        when (type) {
//            Recyclers.SERVICES_CATEGORY_IN_HOME_FRAGMENT -> binding.fragmentRecycler.scrollToPosition(0)
        }
    }

    //==============================================================================================
    // set Recycler ....
    private fun setRecycler() {
        when (type) {
//            Recyclers.SERVICES_CATEGORY_IN_HOME_FRAGMENT -> servicesCategoriesInHomeFragmentRecycler()
        }
    }

    //==============================================================================================
    // Services Categories In HomeRecycler ...
//    private fun servicesCategoriesInHomeFragmentRecycler() {
//        servicesCategories.clear()
//        binding.fragmentRecycler.isNestedScrollingEnabled = false
//        servicesCategories.add(ServiceCategory( 1 , "الخدمات اللوجيستية" , 4 ))
//        servicesCategories.add(ServiceCategory( 2 , "خدمات الرعاية" , 10 ))
//        servicesCategories.add(ServiceCategory( 3 , "خدمات التشغيل والصيانة " , 4 ))
//        servicesCategories.add(ServiceCategory( 4 , "خدمات التشييد والبناء" , 4 ))
//        servicesCategoriesInHomeFragmentRecyclerAdapter = ServicesCategoriesInHomeFragmentRecyclerAdapter(servicesCategories)
//        initializeRecyclerLinearVerticalView(servicesCategoriesInHomeFragmentRecyclerAdapter , false)
//    }

    //==============================================================================================
    // Initialize Recycler Sort Type ...
    private fun initializeRecyclerLinearVerticalView(adapter: RecyclerView.Adapter<*>, viewToLastItem: Boolean) {
        val mLayoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.fragmentRecycler.layoutManager = mLayoutManager
        binding.fragmentRecycler.layoutManager!!.scrollToPosition(if (viewToLastItem) adapter.itemCount-1 else 0)
        binding.fragmentRecycler.itemAnimator = DefaultItemAnimator()

        binding.fragmentRecycler.adapter = adapter
    }

    private fun initializeRecyclerLinearHorizontalView(adapter: RecyclerView.Adapter<*>) {
        val linearLayoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        val mLayoutManager: RecyclerView.LayoutManager = linearLayoutManager
        binding.fragmentRecycler.layoutManager = mLayoutManager
        binding.fragmentRecycler.itemAnimator = DefaultItemAnimator()
        binding.fragmentRecycler.adapter = adapter
    }

    private fun initializeRecyclerGridView(adapter: RecyclerView.Adapter<*>, span: Int) {
        val mLayoutManager: RecyclerView.LayoutManager = GridLayoutManager(context, span)
        binding.fragmentRecycler.layoutManager = mLayoutManager
        binding.fragmentRecycler.itemAnimator = DefaultItemAnimator()
        binding.fragmentRecycler.adapter = adapter
    }
}