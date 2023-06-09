import api.model.*;
import api.service.APIsCallsInterface;
import org.testng.annotations.BeforeClass;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class BookStoreTestClass {

    private APIsCallsInterface apIsCallsInterface;
    private String authToken;

    public String createUserOperation(){
        CreateUser createUser = new CreateUser("ShaimaaTest", "OneTwoThree@123");
        Call<CreateUserResponse> userResponseCall = apIsCallsInterface.createUser(createUser);
        try {
            Response<CreateUserResponse> response = userResponseCall.execute();
            CreateUserResponse createUserResponse = response.body();
            String userId = createUserResponse.getUserID();
            return userId;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void generateToken(String userID){
        GenerateAuthenticationToken generateToken = new GenerateAuthenticationToken("username", "password");
        Call<TokenResponse> tokenResponseCall = apIsCallsInterface.generateToken(generateToken);
        try {
            Response<TokenResponse> response = tokenResponseCall.execute();
            TokenResponse tokenResponse = response.body();
            authToken = tokenResponse.getToken();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public BookListResponse retrieveBooksByAuthor(String author){
        Call<BookListResponse> bookListResponseCall = apIsCallsInterface.getBooksByAuthor(author);
        try {
            Response<BookListResponse> response = bookListResponseCall.execute();
            BookListResponse bookListResponse = response.body();
            return bookListResponse;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @BeforeClass
    public void setup(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://bookstore.toolsqa.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        APIsCallsInterface apiCalls = retrofit.create(APIsCallsInterface.class);

    }


}
