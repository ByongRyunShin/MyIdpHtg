package com.ssapp.myidphtg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapView;
import net.daum.mf.map.api.MapLayout;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;

public class MainActivity extends AppCompatActivity implements MapView.MapViewEventListener, MapView.POIItemEventListener{

    private MapView mapView;

    private static final MapPoint CUSTOM_MARKER_POINT1 = MapPoint.mapPointWithGeoCoord(37.571986,126.9844854);
    private static final MapPoint CUSTOM_MARKER_POINT2 = MapPoint.mapPointWithGeoCoord(37.570384,126.9886279);
    private static final MapPoint CUSTOM_MARKER_POINT3 = MapPoint.mapPointWithGeoCoord(37.5700408,126.9834853);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapView = (MapView)findViewById(R.id.map_view);
        mapView.setDaumMapApiKey(MapApiConst.DAUM_MAPS_ANDROID_APP_API_KEY);
        mapView.setMapViewEventListener(this);
    }

    @Override
    public void onMapViewInitialized(MapView mapView) {
        // MapView had loaded. Now, MapView APIs could be called safely.
        mapView.setMapCenterPointAndZoomLevel(MapPoint.mapPointWithGeoCoord(37.57, 126.986), 2, true);
    }

    @Override
    public void onMapViewCenterPointMoved(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewZoomLevelChanged(MapView mapView, int i) {

    }

    @Override
    public void onMapViewSingleTapped(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDoubleTapped(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewLongPressed(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDragStarted(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDragEnded(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewMoveFinished(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onPOIItemSelected(MapView mapView, MapPOIItem mapPOIItem) {

    }

    @Override
    public void onCalloutBalloonOfPOIItemTouched(MapView mapView, MapPOIItem mapPOIItem) {

    }

    @Override
    public void onCalloutBalloonOfPOIItemTouched(MapView mapView, MapPOIItem mapPOIItem, MapPOIItem.CalloutBalloonButtonType calloutBalloonButtonType) {

    }

    @Override
    public void onDraggablePOIItemMoved(MapView mapView, MapPOIItem mapPOIItem, MapPoint mapPoint) {

    }

    public void onMenuBt1Clicked(View v) {
        MapPOIItem marker1 = new MapPOIItem();
        marker1.setItemName("태화관");
        marker1.setTag(1);
        marker1.setMapPoint(CUSTOM_MARKER_POINT1);
        marker1.setMarkerType(MapPOIItem.MarkerType.CustomImage);
        marker1.setCustomImageResourceId(R.drawable.custom_marker_red);
        //marker1.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        marker1.setCustomImageAutoscale(false);
        marker1.setCustomImageAnchor(0.5f, 1.0f);

        MapPOIItem marker2 = new MapPOIItem();
        marker2.setItemName("탑골 공원");
        marker2.setTag(1);
        marker2.setMapPoint(CUSTOM_MARKER_POINT2);
        marker2.setMarkerType(MapPOIItem.MarkerType.CustomImage);
        marker2.setCustomImageResourceId(R.drawable.custom_marker_red);
        //marker2.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        marker2.setCustomImageAutoscale(false);
        marker2.setCustomImageAnchor(0.5f, 1.0f);

        MapPOIItem marker3 = new MapPOIItem();
        marker3.setItemName("보신각");
        marker3.setTag(1);
        marker3.setMapPoint(CUSTOM_MARKER_POINT3);
        marker3.setMarkerType(MapPOIItem.MarkerType.CustomImage);
        marker3.setCustomImageResourceId(R.drawable.custom_marker_red);
        //marker3.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        marker3.setCustomImageAutoscale(false);
        marker3.setCustomImageAnchor(0.5f, 1.0f);

        mapView.addPOIItem(marker1);
        mapView.addPOIItem(marker2);
        mapView.addPOIItem(marker3);
    }

    public void onMenuBt2Clicked(View v) {

    }

    public void onMenuBt3Clicked(View v) {

    }
}
