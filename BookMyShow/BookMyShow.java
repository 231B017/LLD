/*
#Design Book My Show LLD for 30 min interview
#Functional Requirements:
1. User should be able to search for movies by name, genre, or location.
2. User should be able to view showtimes and available seats for a selected movie.
3. User should be able to book tickets for a selected showtime and seat.
4. User should receive a confirmation of their booking with details.
5. User should be able to cancel their booking and receive a refund if applicable.
6. User should be able to view their booking history and upcoming shows.
7. User should be able to rate and review movies they have watched.
8. User should be able to receive notifications about upcoming shows, discounts, and promotions.
9. User should be able to create and manage their profile, including payment information and preferences.
10. User should be able to share their bookings and reviews on social media platforms.
*/
class User {
    private String userID;
    private String name;
    private String email;
    private String phoneNumber;

    public User(String userID, String name, String email, String phoneNumber) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class Movies {
    private String movieID;
    private String name;
    private String genre;
    private String location;

    public Movies(String movieID, String name, String genre, String location) {
        this.movieID = movieID;
        this.name = name;
        this.genre = genre;
        this.location = location;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

class Seats {
    private String seatID;
    private String seatNumber;
    private boolean isAvailable;

    public Seats(String seatID, String seatNumber, boolean isAvailable) {
        this.seatID = seatID;
        this.seatNumber = seatNumber;
        this.isAvailable = isAvailable;
    }

    public String getSeatID() {
        return seatID;
    }

    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Tickets {
    private String ticketID;
    private String showID;
    private String seatID;
    private String userID;

    public Tickets(String ticketID, String showID, String seatID, String userID) {
        this.ticketID = ticketID;
        this.showID = showID;
        this.seatID = seatID;
        this.userID = userID;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getShowID() {
        return showID;
    }

    public void setShowID(String showID) {
        this.showID = showID;
    }

    public String getSeatID() {
        return seatID;
    }

    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}

class Booking {
    private String bookingID;
    private String userID;
    private String showID;
    private String seatID;
    private String paymentID;

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getShowID() {
        return showID;
    }

    public void setShowID(String showID) {
        this.showID = showID;
    }

    public String getSeatID() {
        return seatID;
    }

    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public Booking(String bookingID, String userID, String showID, String seatID, String paymentID) {
        this.bookingID = bookingID;
        this.userID = userID;
        this.showID = showID;
        this.seatID = seatID;
        this.paymentID = paymentID;
    }
}

class Shows {
    private String showID;
    private String movieID;
    private String showTime;

    public Shows(String showID, String movieID, String showTime) {
        this.showID = showID;
        this.movieID = movieID;
        this.showTime = showTime;
    }

    public String getShowID() {
        return showID;
    }

    public void setShowID(String showID) {
        this.showID = showID;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }
}

class Payment {
    private String paymentID;
    private String userID;
    private double amount;
    private String paymentMethod;

    public Payment(String paymentID, String userID, double amount, String paymentMethod) {
        this.paymentID = paymentID;
        this.userID = userID;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}

class Notification {
    private String notificationID;
    private String userID;
    private String showID;
    private String message;

    public Notification(String notificationID, String userID, String showID, String message) {
        this.notificationID = notificationID;
        this.userID = userID;
        this.showID = showID;
        this.message = message;
    }

    public String getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(String notificationID) {
        this.notificationID = notificationID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getShowID() {
        return showID;
    }

    public void setShowID(String showID) {
        this.showID = showID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


// Strategy Pattern for Payment Methods
interface PaymentStrategy {
    void pay(double amount);
}

class CreditCard implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UPI implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

class CASH implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash.");
    }
}

class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

// strategy pattern for notification
interface NotificationStrategy {
    void sendNotification(String message);
}

class PushNotification implements NotificationStrategy {

    @Override
    public void sendNotification(String message) {
        System.out.println("Push Notification: " + message);
    }
}

class EmailNotification implements NotificationStrategy {

    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification: " + message);
    }
}

class SMSNotification implements NotificationStrategy {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
}

class NotificationProcessor {
    private NotificationStrategy notificationStrategy;

    void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    void sendNotification(String message) {
        notificationStrategy.sendNotification(message);
    }
}

// functionality of booking and notification is implemented in main method for demonstration purpose. In real application, these would be part of service classes handling business logic.
interface ISearchMovies {
    void searchByName(String name);

    void searchByGenre(String genre);

    void searchByLocation(String location);
}

class SearchMovies implements ISearchMovies {

    @Override
    public void searchByName(String name) {
        System.out.println("searching movies by name");
    }

    @Override
    public void searchByGenre(String genre) {
        System.out.println("searching movies by genre");
    }

    @Override
    public void searchByLocation(String location) {
        System.out.println("searching movies by location");
    }
}

interface ISearchShows {
    void searchByMovieID(String movieID);

    void searchByLocation(String location);
}

class SearchShows implements ISearchShows {

    @Override
    public void searchByMovieID(String movieID) {
        System.out.println("searching shows by movieID");
    }

    @Override
    public void searchByLocation(String location) {
        System.out.println("searching shows by location");
    }
}

interface IViewAvailableSeats {
    void viewAvailableSeats(String showID);
}

class ViewAvailableSeats implements IViewAvailableSeats {
    @Override
    public void viewAvailableSeats(String showID) {
        System.out.println("viewing available seats for showID: " + showID);
    }
}

interface ISearchSeats {
    void searchByShowID(String showID);

    void searchBySeatNumber(String seatNumber);
}

class SearchSeats implements ISearchSeats {

    @Override
    public void searchByShowID(String showID) {
        System.out.println("searching seats by showID: " + showID);
    }

    @Override
    public void searchBySeatNumber(String seatNumber) {
        System.out.println("searching seats by seat number: " + seatNumber);
    }
}

interface IViewSeats {
    void viewSeats(String showID);
}

class ViewSeats implements IViewSeats {
    @Override
    public void viewSeats(String showID) {
        System.out.println("viewing seats for showID: " + showID);
    }
}

interface IConfirmBooking {
    void confirmBooking(String bookingID);
}

class ConfirmBooking implements IConfirmBooking {
    @Override
    public void confirmBooking(String bookingID) {
        System.out.println("confirming booking with bookingID: " + bookingID);
    }
}

interface IViewBooking {
    void viewBookingHistory(String userID);

    void viewUpcomingShows(String userID);
}

class ViewBookingHistory implements IViewBooking {
    @Override
    public void viewBookingHistory(String userID) {
        System.out.println("viewing booking history for userID: " + userID);
    }

    @Override
    public void viewUpcomingShows(String userID) {
        System.out.println("viewing upcoming shows for userID: " + userID);
    }
}

interface IViewBookingHistory {
    void viewBookingHistory(String userID);
}

class ViewBookingHistoryImpl implements IViewBookingHistory {
    @Override
    public void viewBookingHistory(String userID) {
        System.out.println("viewing booking history for userID: " + userID);
    }
}

interface ICancelBooking {
    void cancelBooking(String bookingID);
}

class CancelBooking implements ICancelBooking {
    @Override
    public void cancelBooking(String bookingID) {
        System.out.println("cancelling booking with bookingID: " + bookingID);
    }
}

interface IViewCancelBooking {
    void cancelBooking(String bookingID);
}
class ViewCancelBookingImpl implements IViewCancelBooking {
    @Override
    public void cancelBooking(String bookingID) {
        System.out.println("cancelling booking with bookingID: " + bookingID);
    }
}


public class BookMyShow {
    public static void main(String[] args) {
        User user = new User("1", "Virat", "virat@gmail.com", "9876543210");
        Movies movies = new Movies("1", "Krrish", "ACTION", "Mumbai");
        Seats seats = new Seats("1", "A1", true);
        Tickets tickets = new Tickets("1", "1", "1", "1");
        Booking booking = new Booking("1", "1", "1", "1", "1");
        Shows shows = new Shows("1", "1", "7:00 PM");
        Payment payment = new Payment("1", "1", 500.0, "Credit Card");
        Notification notification = new Notification("1", "1", "1", "Your booking is confirmed for Krrish at 7:00 PM. Enjoy your movie!");

        SearchMovies searchMovies = new SearchMovies();
        searchMovies.searchByName("Krrish");
        searchMovies.searchByGenre("ACTION");
        searchMovies.searchByLocation("Mumbai");

        SearchShows searchShows = new SearchShows();
        searchShows.searchByMovieID("1");
        searchShows.searchByLocation("Mumbai");

        ViewAvailableSeats viewAvailableSeats = new ViewAvailableSeats();
        viewAvailableSeats.viewAvailableSeats("1");

        SearchSeats searchSeats = new SearchSeats();
        searchSeats.searchByShowID("1");
        searchSeats.searchBySeatNumber("A1");

        ViewSeats viewSeats = new ViewSeats();
        viewSeats.viewSeats("1");
        ConfirmBooking confirmBooking = new ConfirmBooking();
        confirmBooking.confirmBooking("1");
        ViewBookingHistory viewBookingHistory = new ViewBookingHistory();
        viewBookingHistory.viewBookingHistory("1");
        viewBookingHistory.viewUpcomingShows("1");


        // Payment processing using Strategy Pattern
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.setPaymentStrategy(new CreditCard());
        paymentProcessor.processPayment(payment.getAmount());

        // Payment Via UPI
        paymentProcessor.setPaymentStrategy(new UPI());
        paymentProcessor.processPayment(payment.getAmount());

        // Payment Via CASH
        paymentProcessor.setPaymentStrategy(new CASH());
        paymentProcessor.processPayment(payment.getAmount());

        // Notification sending using Strategy Pattern
        NotificationProcessor notificationProcessor = new NotificationProcessor();
        notificationProcessor.setNotificationStrategy(new PushNotification());
        notificationProcessor.sendNotification(notification.getMessage());

        // Email Notification
        notificationProcessor.setNotificationStrategy(new EmailNotification());
        notificationProcessor.sendNotification(notification.getMessage());
        // SMS Notification
        notificationProcessor.setNotificationStrategy(new SMSNotification());
        notificationProcessor.sendNotification(notification.getMessage());

        CancelBooking cancelBooking = new CancelBooking();
        cancelBooking.cancelBooking("1");

        ViewCancelBookingImpl viewCancelBooking = new ViewCancelBookingImpl();
        viewCancelBooking.cancelBooking("1");

    }
}
