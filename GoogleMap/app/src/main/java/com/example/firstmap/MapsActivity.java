package com.example.firstmap;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        LatLng Binalonan = new LatLng(	16.047440, 120.592331);

        // mark james
        LatLng ucu = new LatLng(15.980586913525785, 120.56060394063958);
        LatLng seven11 = new LatLng(15.982015600271875, 120.56018041639149);
        LatLng ragontoncanteen = new LatLng(15.980054451108296, 120.563620886452);
        LatLng jcGasHaus = new LatLng(15.979034534300881, 120.56580183977935);
        LatLng teacubs = new LatLng(15.979275302022451, 120.5709672557918);
        LatLng cebuanaurd = new LatLng(15.993175802379593, 120.5740978109079);
        LatLng pitstop = new LatLng(16.017698826591726, 120.57963851417603);
        LatLng motorupgrade = new LatLng(16.034231013127048, 120.58349257540493);
        LatLng everlasting = new LatLng(16.042207428280346, 120.58513437762623);
        LatLng jollibee = new LatLng(16.046787800084825, 120.58622992974105);
        LatLng cebuana = new LatLng(16.046408284156595, 120.59083468721654);
        LatLng ruralbank = new LatLng(16.046525423504665, 120.59426631403477);
        LatLng chochopan = new LatLng(16.04686755438887, 120.59731592926184);
        LatLng bakeshop = new LatLng(16.047022365898453, 120.59788077202245);
        LatLng HWroad = new LatLng(16.052244956306573, 120.60508138432333);
        LatLng waterstation= new LatLng(16.056708527517134, 120.61921727212071);
        LatLng brgyHall= new LatLng(16.057899821415887, 120.62379564866636);
        LatLng highway= new LatLng(16.057958422615133, 120.62443068040226);
        LatLng store= new LatLng(16.05885230329596, 120.62385307901734);
        LatLng shed= new LatLng(16.06185565076159, 120.62267154258817);
        LatLng FGT= new LatLng(16.061892941552102, 120.6224034686447);
        LatLng shed2= new LatLng(16.063266514698956, 120.62158349871174);
        LatLng store2= new LatLng(16.062701684889333, 120.62039924253405);
        LatLng papasok= new LatLng(16.06352010949882, 120.61996140033362);
        LatLng house= new LatLng(16.06326870309113, 120.61947248343792);
        LatLng School = new LatLng(	16.058882794736494, 120.62283187183762);
        LatLng UCU = new LatLng(15.980552121715178, 120.560594289871);
        LatLng Home= new LatLng(16.063271942424343, 120.61945279413636 );


        mMap.addMarker(new MarkerOptions().position(School).title("Marker in San Felipe National High School").snippet("Mark James Esquejo"));
        mMap.addMarker(new MarkerOptions().position(Home).title("Marker in Esquejo House").snippet("Mark James Esquejo"));
        mMap.addMarker(new MarkerOptions().position(UCU).title("Marker in Urdaneta City University").snippet("Mark James Esquejo"));
        mMap.addMarker(new MarkerOptions().position(Binalonan).title("Marker in Binalonan").snippet("Mark James Esquejo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Binalonan));



        //polyline
        mMap.addPolyline(new PolylineOptions()
                .add(ucu, seven11, ragontoncanteen, jcGasHaus, teacubs, cebuanaurd, pitstop, motorupgrade, everlasting,
                        jollibee, cebuana, ruralbank, chochopan, bakeshop, HWroad, waterstation,
                        brgyHall, highway, store, shed, FGT, shed2, store2, papasok, house)

                .width(10)
                .color(Color.BLUE));

        //National
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.058892888913572, 120.62283899356397))
                .radius(40)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        //home
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.063271942424343, 120.61945279413636))
                .radius(30)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        //UCU
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.980586913525785, 120.56060394063958))
                .radius(70)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.TRANSPARENT));



        //-------------Ed Paulo------------------//
        LatLng Urdaneta = new LatLng(	15.9758, 120.5707);
        LatLng National = new LatLng(15.978737379129132, 120.563190995862);

        LatLng useeu = new LatLng(15.98061, 120.56042);
        LatLng boobacool = new LatLng(15.98147, 120.56052);
        LatLng gashaus = new LatLng(15.97898, 120.56582);
        LatLng normsrentcar = new LatLng (15.979056770867201, 120.56809915983989);
        LatLng teacub2 = new LatLng (15.979268058483587, 120.57098037855256);
        LatLng cocolandia = new LatLng (15.982841017237638, 120.57205043109852);
        LatLng sseven11 = new LatLng (15.98670, 120.57253);
        LatLng psu = new LatLng(15.988623689999022, 120.57355087217023);
        LatLng HWkamalig = new LatLng (15.99553668825218, 120.57488910343469);
        LatLng HWcrabporkie = new LatLng (15.997746514617758, 120.57500460189618);
        LatLng church = new LatLng (15.998234050319745, 120.57509476687245);
        LatLng UrdanetaCU = new LatLng (15.980552121715178, 120.560594289871);
        LatLng house2 = new LatLng (15.99421518621818, 120.58466397408569);
        LatLng home2 = new LatLng (15.9942268, 120.584668);


        //marker
        mMap.addMarker(new MarkerOptions().position(UrdanetaCU).title("Marker in Urdaneta City University").snippet("Ed Paulo Tibus").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(National).title("Marker in Urdaneta City National High School").snippet("Ed Paulo Tibus").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(home2).title("Marker in Ed Paulo's House").snippet("Ed Paulo Tibus").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(Urdaneta).title("Marker in Urdaneta City").snippet("Ed Paulo Tibus").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Urdaneta));


        //polyline
        mMap.addPolyline(new PolylineOptions()
                .add(useeu, boobacool, gashaus, normsrentcar, teacub2, cocolandia, sseven11, psu, HWkamalig, HWcrabporkie, church, house2)

                .width(10)
                .color(Color.RED));

        //home
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.9942268, 120.584668))
                .radius(30)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        //national
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.978737379129132, 120.563190995862))
                .radius(40)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        //ucu
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.980586913525785, 120.56060394063958))
                .radius(70)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.TRANSPARENT));


        //-------------------catherrine-------------------//
        LatLng Malasiqui = new LatLng(	15.918395675784149, 120.45924665787801);

        LatLng UrdanetaCityUniversity = new LatLng(15.980661163734553, 120.56062876202421);
        LatLng seveneleven = new LatLng(15.98186666168837, 120.56014526515715);
        LatLng sunrisecomplex = new LatLng(15.98086093753998, 120.56213534321604);
        LatLng jcgas = new LatLng(15.978972170710678, 120.56581201655237);
        LatLng normreancar = new LatLng(15.97906018151457, 120.56810088508496);
        LatLng tcubs = new LatLng(15.97926586545836, 120.57096968356328);
        LatLng lodgeapartelle = new LatLng(15.97585685025328, 120.57069061756117);
        LatLng mall168 = new LatLng(15.975109270841251, 120.57060237787019);
        LatLng CSIcomplex = new LatLng(15.971513006970937, 120.57152712752038);
        LatLng MCarthurHW = new LatLng(15.967986530922435, 120.57215308817808);
        LatLng golderarrow = new LatLng(15.965493094727467, 120.57266242043949);
        LatLng majesty = new LatLng(15.962969511228641, 120.57350156099433);
        LatLng roccoskoreangrill = new LatLng(15.958450966172176, 120.57474296449831);
        LatLng LGKguanzon = new LatLng(15.951944813556196, 120.5773356623317);
        LatLng bagoongspecial = new LatLng(15.946905823073699, 120.5796433571638);
        LatLng albevrastore = new LatLng(15.943768824787638, 120.5805970988966);
        LatLng phoenixgas = new LatLng(15.939850013554754, 120.58081599047638);
        LatLng ruscovillasis = new LatLng(15.933016305595675, 120.58112147772975);
        LatLng maynardeatery = new LatLng(15.926772367324231, 120.58071170338594);
        LatLng uratex = new LatLng(15.913556680750078, 120.5839809795199);
        LatLng tindahan = new LatLng(15.906240874343599, 120.58526079519437);
        LatLng brgyhall = new LatLng(15.908612222779457, 120.57967320915472);
        LatLng villasissbypass = new LatLng(15.906632667441455, 120.5706969674265);
        LatLng municipality = new LatLng( 15.912121535763143, 120.5542953299333);
        LatLng petron = new LatLng(15.917879299178189, 120.53929091152767);
        LatLng villasisRD = new LatLng(15.918815209404766, 120.53577821990069);
        LatLng evacuation = new LatLng(15.919515446193063, 120.52533604816904);
        LatLng monterosfarm = new LatLng(15.917324409326223, 120.51554413801838);
        LatLng villasismalasiquiRD = new LatLng(15.914874122187257, 120.50641711049317);
        LatLng lareglaregRD = new LatLng(15.910290924935788, 120.5067262556769);
        LatLng houses = new LatLng(15.90936151698669, 120.50522693813538);
        LatLng monastery = new LatLng(15.907612828916326, 120.50654297894937);
        LatLng inc = new LatLng(15.895854830548913, 120.51001042913896);
        LatLng juvystore = new LatLng(15.88656, 120.511651);
        LatLng simbahan = new LatLng(15.887170, 120.512338);
        LatLng Cathouse = new LatLng( 15.887665, 120.51353);
        LatLng secondary = new LatLng(15.882423, 120.511705);
        LatLng youcu = new LatLng (15.980552121715178, 120.560594289871);


        //marker
        mMap.addMarker(new MarkerOptions().position(youcu).title("Marker in Urdaneta City University").snippet("Catherine Pascua").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(Cathouse).title("Marker in Catherine's House").snippet("Catherine Pascua ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(secondary).title("Marker in Tobor National High School").snippet("Catherine Pascua ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Malasiqui));


        //polyline
        mMap.addPolyline(new PolylineOptions()
                .add(UrdanetaCityUniversity, seveneleven, sunrisecomplex, jcgas, normreancar, tcubs, lodgeapartelle, mall168, CSIcomplex, MCarthurHW,
                        golderarrow, majesty, roccoskoreangrill, LGKguanzon, bagoongspecial, albevrastore, phoenixgas, ruscovillasis,
                        maynardeatery, uratex, tindahan, brgyhall, villasissbypass, municipality, petron, villasisRD, evacuation,
                        monterosfarm, villasismalasiquiRD, lareglaregRD, houses, monastery, inc, juvystore, simbahan, Cathouse)

                .width(10)
                .color(Color.DKGRAY));


        //home
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.887665, 120.51353))
                .radius(30)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        //ucu
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.980586913525785, 120.56060394063958))
                .radius(70)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.TRANSPARENT));

        //national
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.882423, 120.511705))
                .radius(40)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));


        //-------------------jenny-------------------//
        LatLng Manaoag = new LatLng(16.0506,120.4934);

        LatLng YouCU = new LatLng(15.980661163734553, 120.56062876202421);
        LatLng SevenEleven = new LatLng(15.98185061330712, 120.56013331156912);
        LatLng gasolstation = new LatLng(15.982530141612086, 120.55854102793776);
        LatLng urdmanaoag4 = new LatLng(15.986939639750897, 120.54925583178918);
        LatLng camantiles = new LatLng(15.990714523373144, 120.54377339037303);
        LatLng urdmanaoagrd3 = new LatLng(15.99257132078764, 120.54220070820466);
        LatLng shabushabuseafood = new LatLng(15.994835783563227, 120.54073170754464);
        LatLng materialstrading = new LatLng(15.995965451732728, 120.53965269098865);
        LatLng urdmanaoagrd2 = new LatLng(16.003556619646513, 120.53466547054173);
        LatLng paraiso = new LatLng(16.007184672369714, 120.52989424652144);
        LatLng urdmanaoagrd = new LatLng(16.009875782014365, 120.52620974465523);
        LatLng bakasale = new LatLng(16.00968570113221, 120.52437840111934);
        LatLng lalemaan = new LatLng(16.00823, 120.52555);
        LatLng secondaryschool = new LatLng(16.018239744620654, 120.51547837861416);
        LatLng jenhaus = new LatLng(16.00823, 120.52555);
        LatLng urdanetaCU = new LatLng (15.980552121715178, 120.560594289871);


        //marker
        mMap.addMarker(new MarkerOptions().position(urdanetaCU).title("Marker in Urdaneta City University").snippet("Jenny Ann Libed").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions().position(jenhaus).title("Marker in Jenny's House").snippet("Jenny Ann Libed").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions().position(secondaryschool).title("Marker Cabanbanan National High School").snippet("Jenny Ann Libed").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Manaoag));


        //polyline
        mMap.addPolyline(new PolylineOptions()
                .add(YouCU, SevenEleven, gasolstation, urdmanaoag4, camantiles, urdmanaoagrd3, shabushabuseafood,
                        materialstrading, urdmanaoagrd2, paraiso, urdmanaoagrd, bakasale, lalemaan)

                .width(10)
                .color(Color.YELLOW));

        //home
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.00823, 120.52555))
                .radius(30)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        //ucu
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.980586913525785, 120.56060394063958))
                .radius(70)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.TRANSPARENT));

        //national
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.018290463799044, 120.51546757656226))
                .radius(40)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

    }
}