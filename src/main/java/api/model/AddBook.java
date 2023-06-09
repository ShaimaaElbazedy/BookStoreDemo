package api.model;

public class AddBook {
    //Variables Declaration
    private String userId;
    private String [] collectionsOfISBNS;

    //Setters & Getters


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String[] getCollectionsOfISBNS() {
        return collectionsOfISBNS;
    }

    public void setCollectionsOfISBNS(String[] collectionsOfISBNS) {
        this.collectionsOfISBNS = collectionsOfISBNS;
    }
}
