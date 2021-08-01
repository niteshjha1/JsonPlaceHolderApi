package com.niteshjha.jsonplaceholderapi;

import org.w3c.dom.Comment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts();








//    fun checkLogin(
//            @Field("email")email : String,
//            @Field("password")password: String
//
//    ): Call<LoginResponse?>?
//
//
//    @GET("posts")
//    public void  getPosts(
//            @Query("userId")userId: Array<Int?>?,
//            @Query("_sort")sort: String?,
//            @Query("_order")order: String?) : Call<List<Post?>?>?
//
////    @GET("posts")
////    fun getPosts(@QueryMap parameters: <String?, String?>?): Call<List<Post?>?>?
//
//    @GET("posts/{id}/comments")
//    fun getComments(@Path("id")postId: Int): Call<List<Comment?>?>?
//
//
////    @POST("posts")
////    fun createPost(@Body post: Post?): Call<Post?>?
//
//    @FormUrlEncoded
//    @POST("posts")
//    fun createPost(
//            @Field("userId") userId: Int,
//            @Field("title") title: String?,
//            @Field("body") body: String?): Call<Post?>?
//
//    @FormUrlEncoded
//    @POST("posts")
//    open fun createPost(@FieldMap field: Map<String?, String?>?): Call<Post?>?

}




