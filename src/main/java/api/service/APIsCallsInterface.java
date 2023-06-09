package api.service;

import api.model.*;
import retrofit2.Call;
import retrofit2.http.*;

public interface APIsCallsInterface {

    @POST("Account/v1/User")
    Call<CreateUserResponse> createUser(@Body CreateUser createUser);

    @POST("Account/v1/GenerateToken")
    Call<TokenResponse> generateToken(@Body GenerateAuthenticationToken tokenRequest);

    @GET("BookStore/v1/Books")
    Call<BookListResponse> getBooks();

    //Hint: NOT working on postman
    @GET("BookStore/v1/Books")
    Call<BookListResponse> getBooksByAuthor(@Query("author") String author);

    @POST("BookStore/v1/Books")
    Call<AddBookResponse> postBooks (@Body AddBook addBook, @Header("Authorization") String authToken);


}
