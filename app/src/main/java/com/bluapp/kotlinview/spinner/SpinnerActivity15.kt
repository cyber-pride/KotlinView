package com.bluapp.kotlinview.spinner

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.bluapp.kotlinview.R
import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class SpinnerActivity15 : AppCompatActivity() {
    private var progressDialog: ProgressDialog? = null
    private var spinner: Spinner? = null
    private var baseUrl: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner15)
        spinner = findViewById(R.id.spinner) as Spinner
        baseUrl = "http://dummy.restapiexample.com/"
        fetchData();
    }

    private fun fetchData() {
        progressDialog = ProgressDialog(this@SpinnerActivity15)
        progressDialog!!.setMessage(getString(R.string.loading))
        progressDialog!!.setCancelable(false)
        progressDialog!!.show()
        //Defining retrofit api service
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create<ApiService>(ApiService::class.java!!)
        val call = service.GetEmployeeData()
        //calling the api
        call.enqueue(object : Callback<List<RetrofitGetResponse>> {
            override fun onResponse(call: Call<List<RetrofitGetResponse>>, response: Response<List<RetrofitGetResponse>>) {
                //hiding progress dialog
                progressDialog!!.dismiss()
                //if there is no error
                val responseList = response.body()
                val item = arrayOfNulls<String>(responseList!!.size)
                for(i in 0 until responseList.size){
                    item[i] = responseList.get(i).employeeName
                }
                val arrayadapter = ArrayAdapter(this@SpinnerActivity15, android.R.layout.simple_spinner_item, item)
                spinner?.adapter = arrayadapter
            }
            override fun onFailure(call: Call<List<RetrofitGetResponse>>, t: Throwable) {
                progressDialog!!.dismiss()
                Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
            }
        })
    }

    private interface ApiService {
        @GET("api/v1/employees")
        fun GetEmployeeData(): Call<List<RetrofitGetResponse>>
    }

    private inner class RetrofitGetResponse {
        @SerializedName("profile_image")
        var profileImage: String? = null
        @SerializedName("employee_name")
        var employeeName: String? = null
        @SerializedName("employee_salary")
        var employeeSalary: String? = null
        @SerializedName("id")
        var id: String? = null
        @SerializedName("employee_age")
        var employeeAge: String? = null
    }

}
