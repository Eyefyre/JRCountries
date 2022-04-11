# restcountriesJava
Java Wrapper for https://restcountries.eu/

This is for the V3.1 endpoint
Maintained by [Eyefyre](https://github.com/Eyefyre)
 
## Example
 
 All methods return an arraylist of countries, even if there is only one country in the arraylist.
 An example of how to get country info by name
 ```
 CountryClient client = new CountryClient();
 ArrayList<Country> France = client.getCountryByName("france");
```

## Usable Methods
 Below is a list of usable methods in this wrapper
  ```
    ArrayList<Country> getAllCountries();
    ArrayList<Country> getCountryByName(String name);
    ArrayList<Country> getCountryByFullName(String name);
    ArrayList<Country> getCountryByCode(String code);
    ArrayList<Country> getCountryByCodeList(String codeList);
    ArrayList<Country> getCountryByCurrency(String currency);
    ArrayList<Country> getCountryByLanguage(String lang);
    ArrayList<Country> getCountryByTranslation(String translation);
    ArrayList<Country> getCountryByCapitalCity(String capital);
    ArrayList<Country> getCountryByCallingCode(String callingCode);
    ArrayList<Country> getCountryByRegion(String region);
    ArrayList<Country> getCountryByRegionalBloc(String bloc);
    ArrayList<Country> getCountryByDemonym(String demonym);

```
 
