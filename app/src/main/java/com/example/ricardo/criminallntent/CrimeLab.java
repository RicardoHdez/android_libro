package com.example.ricardo.criminallntent;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    //En caso de que no exista la instancia sera creada
    //Devuelve un arreglo
    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
        //for (int i = 0; i < 20; i++){
            //Crime crime = new Crime();
            //crime.setTitle("Crimen #" + i);
            //crime.setSolved(i % 2 == 0);
            //mCrimes.add(crime);
        //}
    }

    //capitulo 13.10
    public void addCrime(Crime c){
        mCrimes.add(c);
    }

    //Si existiera esa instancia la clase devuelve una instancia
    //Devolviendo un ID, del arreglo creado o por el arreglo ya creado con anterioridad
    public List<Crime>getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime crime : mCrimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }
}
