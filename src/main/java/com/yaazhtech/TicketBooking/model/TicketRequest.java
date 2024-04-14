package com.yaazhtech.TicketBooking.model;
public class TicketRequest {
    private String name;
    private String mobile;
    private String email;
    private String ticketId;
    private String movieTime;
    private String movieTitle;
    private String showSession;//private ShowSession showSession;//private List<ShowSession> showSession (creating class inside class inner class or pojo class)
    private String noOfPeople;
    private String seatType;
    private String seatLocation;
    public TicketRequest(String name, String mobile, String email, String ticketId, String movieTime, String movieTitle, String showSession, String noOfPeople, String seatType, String seatLocation) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.ticketId = ticketId;
        this.movieTime = movieTime;
        this.movieTitle = movieTitle;
        this.showSession = showSession;
        this.noOfPeople = noOfPeople;
        this.seatType = seatType;
        this.seatLocation = seatLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getShowSession() {
        return showSession;
    }

    public void setShowSession(String showSession) {
        this.showSession = showSession;
    }

    public String getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(String noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getSeatLocation() {
        return seatLocation;
    }

    public void setSeatLocation(String seatLocation) {
        this.seatLocation = seatLocation;
    }
}