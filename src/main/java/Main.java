import api.model.BookDetails;
import api.model.BookListResponse;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Initiating an object from BookStoreTestClass
        BookStoreTestClass bookStore =  new BookStoreTestClass();

        //Calling the setup method to initiate retrofit instance
        bookStore.setup();

        //Creating new user and retrieving the userID
        String userID = bookStore.createUserOperation();

        //Generating a token for the created user
        bookStore.generateToken(userID);

        //Filtering list of books by Author
        BookListResponse listOfAuthorBooks = bookStore.retrieveBooksByAuthor("Axel Rauschmayer");

        System.out.println(listOfAuthorBooks);


    }
}