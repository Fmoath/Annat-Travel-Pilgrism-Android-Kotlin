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
import fm.ps.annat.travel.pilgrism.adapter.recycler.contactus.ContactUsRecyclerAdapter
import fm.ps.annat.travel.pilgrism.databinding.FragmentRecyclerBinding
import fm.ps.annat.travel.pilgrism.keys.ContactUss
import fm.ps.annat.travel.pilgrism.keys.Recyclers
import fm.ps.annat.travel.pilgrism.model.ContactUs
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
    private val contactUss : ArrayList<ContactUs> = ArrayList<ContactUs>()

    //==============================================================================================
    // Adapter ...
    private lateinit var contactUsRecyclerAdapter: ContactUsRecyclerAdapter

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
            Recyclers.RECYCLER_CONTACT_US -> binding.fragmentRecycler.scrollToPosition(contactUss.size-1)
        }
    }

    //==============================================================================================
    // set Recycler ....
    private fun setRecycler() {
        when (type) {
            Recyclers.RECYCLER_CONTACT_US -> contactUsRecycler()
        }
    }

    //==============================================================================================
    // Services Categories In HomeRecycler ...
    private fun contactUsRecycler() {
        contactUss.clear()
        binding.fragmentRecycler.isNestedScrollingEnabled = false
        contactUss.add(ContactUs( 0 , "" , "اليوم الساعة 4:30 مساءاً" , ContactUss.CONTACT_US_DATE))
        contactUss.add(ContactUs( 0 , "السلام عليكم ورحمة الله وبركاته" , "" , ContactUss.CONTACT_US_CLIENT))
        contactUss.add(ContactUs( 0 , "وعليكم السلام ورحمة الله وبركاته" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_COMPANY))
        contactUss.add(ContactUs( 0 , "لدي مشكلة في غرفتي في الفندق" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_CLIENT))
        contactUss.add(ContactUs( 0 , "الكهرباء متعطلة ولا تعمل وأنا في حاجتها" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_CLIENT))
        contactUss.add(ContactUs( 0 , "منذ متى بدأت هذه المشكلة" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_COMPANY))
        contactUss.add(ContactUs( 0 , "منذ ساعتين تقريباً" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_CLIENT))
        contactUss.add(ContactUs( 0 , "ولا يهمك أخي بإذن الله نتواصل مع إدارة الفندق وسنعمل على حلها في أقرب وقت ممكن .. نعتذر بالنيابة عنا وعن إدارة الفندق على هذا العطل وسنعمل على إصلاحه" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_COMPANY))
        contactUss.add(ContactUs( 0 , "أتمنى ان لا يطول هذذا العطل .. شكراً لكم" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_CLIENT))
        contactUss.add(ContactUs( 0 , "" , "اليوم الساعة 5:30 مساءاً" , ContactUss.CONTACT_US_DATE))
        contactUss.add(ContactUs( 0 , "السلام عليكم ورحمة الله وبركاته" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_COMPANY))
        contactUss.add(ContactUs( 0 , "الحمد لله قمنا بحل هذا العطل  ويمكنك الآن إستخدام الكهرباء  بدون أي مشاكل .. كل الإحترام لك .. شكراً لتفهمك" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_COMPANY))
        contactUss.add(ContactUs( 0 , "شكراً لكم بالفعل تم حلها .. جهد مبارك" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_CLIENT))
        contactUss.add(ContactUs( 0 , "العفو .. تقبل فائق إحترامنا وتقديرنا\nمع تحياتنا في مركز التواصل والدعم" , "12-4-2022 , 3:40 PM" , ContactUss.CONTACT_US_COMPANY))

        contactUsRecyclerAdapter = ContactUsRecyclerAdapter(contactUss)
        initializeRecyclerLinearVerticalView(contactUsRecyclerAdapter , true)
    }

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