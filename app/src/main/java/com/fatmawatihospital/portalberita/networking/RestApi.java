package com.fatmawatihospital.portalberita.networking;


import com.isoneday.portalberita.model.ModelBerita;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {

    @GET("tampil_berita.php")
    Call<ModelBerita> getdataBerita();
}
