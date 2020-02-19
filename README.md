# JRCountries
Java Wrapper for https://restcountries.eu/

Maintained by [Eyefyre](https://github.com/Eyefyre)
 
## Example
 Full Documentation coming soon
 
 All methods return an arraylist of countries, even if there is only one country in the arraylist.
 ```
 public class RestCountries {
    public static void main(String[] args) {
        CountryClient client = new CountryClient();
        ArrayList<Country> France = client.getCountryByName("france");
        System.out.println(France);
    }
}
```
 This wrapper uses a caching system.
 When a method is called, the returned object is stored in a local cache,
 If the same method is called within a set time, the cache is used instead of the API being called.
 The user can set this time as shown below. Note that the time given is in seconds. The default time is 600 seconds/10 minutes
  ```
 public class RestCountries {
    public static void main(String[] args) {
        CountryClient client = new CountryClient();
        client.changeCacheTimeAmount(60);
    }
}
```
