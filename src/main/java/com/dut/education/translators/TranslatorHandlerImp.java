package com.dut.education.translators;

import com.ibm.icu.text.Transliterator;
import org.springframework.stereotype.Component;

@Component
public class TranslatorHandlerImp implements TranslatorHandler{
    private static String CYRILLIC_TO_LATIN = "Russian-Latin/BGN" ;
    private static String UA_TO_LATIN = "Ukrainian-Latin/BGN" ;

    public String reformatTypeCharacters (String city){
        String typeCharacters = defineTypeCharacters(city);
        if(typeCharacters!="lat"){
            Transliterator toLatinTrans = Transliterator.getInstance(typeCharacters);
            return toLatinTrans.transliterate(city);
        }
        return city;
    }

    private String defineTypeCharacters(String city){
        for (char a : city.toCharArray()) {
            if (Character.UnicodeBlock.of(a) == Character.UnicodeBlock.CYRILLIC) {
                return CYRILLIC_TO_LATIN;
            }
        }
        return "lat";
    }

}
