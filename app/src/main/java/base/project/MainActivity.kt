package base.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import base.project.adapter.AppRecyclerviewAdapter
import base.project.model.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var newsList: MutableList<BaseModel> = mutableListOf()

    private lateinit var appAdapter: AppRecyclerviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateData()
        appAdapter = AppRecyclerviewAdapter(newsList)
        rc_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = appAdapter
        }
    }

    private fun generateData() {
        newsList.add(TitleModel("In Stores, Secret Surveillance Tracks Your Every Move"))
        newsList.add(SpotImageModel("https://static01.nyt.com/newsgraphics/2019/05/15/privacy-beacons/dadf2947e5eb243ff4d129c8c4f30055e8ed01ed/buckethat_cover.png"))
        newsList.add(DescriptionModel("As you shop, “beacons” are watching you, using hidden technology in your phone."))
        newsList.add(ContentModel("Imagine you are shopping in your favorite grocery store. As you approach the dairy aisle, you are sent a push notification in your phone: “10 percent off your favorite yogurt! Click here to redeem your coupon.” You considered buying yogurt on your last trip to the store, but you decided against it. How did your phone know?"))
        newsList.add(ContentModel("Your smartphone was tracking you. The grocery store got your location data and paid a shadowy group of marketers to use that information to target you with ads. Recent reports have noted how companies use data gathered from cell towers, ambient Wi-Fi, and GPS. But the location data industry has a much more precise, and unobtrusive, tool: Bluetooth beacons."))
        newsList.add(ContentModel("These beacons are small, inobtrusive electronic devices that are hidden throughout the grocery store; an app on your phone that communicates with them informed the company not only that you had entered the building, but that you had lingered for two minutes in front of the low-fat Chobanis."))
    }

}
