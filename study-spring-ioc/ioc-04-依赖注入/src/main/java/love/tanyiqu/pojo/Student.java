package love.tanyiqu.pojo;

import java.util.*;

public class Student {
    String name;
    Address address;
    String[] books;
    List<String> hobbies;
    Map<String, String> card;
    Set<String> games;
    String wife;
    Properties info;

    @Override
    public String toString() {
        return "name='" + name + '\'' + '\n' +
                "address=" + address + '\n' +
                "books=" + Arrays.toString(books) + '\n' +
                "hobbies=" + hobbies + '\n' +
                "card=" + card + '\n' +
                "games=" + games + '\n' +
                "wife='" + wife + '\'' + '\n' +
                "info=" + info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }
}
