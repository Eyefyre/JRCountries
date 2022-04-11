/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Adam
 */
public class MapResource {

    String googleMaps;
    String openStreetMaps;

    public String getGoogleMaps() {
        return googleMaps;
    }

    public void setGoogleMaps(String googleMaps) {
        this.googleMaps = googleMaps;
    }

    public String getOpenStreetMaps() {
        return openStreetMaps;
    }

    public void setOpenStreetMaps(String openStreetMaps) {
        this.openStreetMaps = openStreetMaps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MapResource{googleMaps=").append(googleMaps);
        sb.append(", openStreetMaps=").append(openStreetMaps);
        sb.append('}');
        return sb.toString();
    }

}
