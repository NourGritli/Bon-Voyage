
# Installing the project on Eclipse Papyrus:
  1. git clone https://github.com/NourGritli/Bon-Voyage.git on command line or just download ZIP from the github repository.
  2. On eclipse click on : file -> import ->existing project into workspace -> select the project folder .

NOTE : you should have Papyrus already installed. To do so : go to HELP -> Install new software -> copy the url of the papyrus  release update site related to your Eclipse version.


# Bon-Voyage
“Bon Voyage” is a model-based reservation system to leverage modeling benefits in online reservation systems. This system provides information of other companies (suppliers) as models to facilitate the booking process for the end users; for instance reserving airline flights, book hotel rooms or renting cars all in one place. Users can browse items based on the prices or discounts and complete the reservation; they will connect to ‘Banking Systems’ and ‘Suppliers’ to complete reservation process in anytime 24/7 and get tickets.

Different kinds of the offers can be defined in the system, but for minimizing any future changes in the system, we defined all reservations in three main categories:

• Transportation items (Flight reservation, etc.)

• Accommodation items (Hotel room, etc.)

• Activity items (Concerts, museums etc.)

The online customer can select one of the items by entering details and search for best available offers. For example by selecting “Flights”, specifying date and destination they can receive any offer from airlines in the system. Each of these categories has the specific form of search to get the list of most pertinent results. By selecting an item user can continue the process of making the reservation. In this system, each user needs to be authorized (have an account) and complete the payment with the bank to make the reservation and receive ticket or confirmation. Cancelling the orders are possible before the payment.

# Functional requirements:

Search: clients search for desired service and the query will be send to suppliers API and the responds will be sent back and be displayed to clients.

Edit reservation(item): client can change the details of the selected time

Make a payment: an authenticated client may make a payment to reserve the selected item and Bank send the transaction confirmation to system.

Authenticate(authenticating): client may use his/her previous registered information to become authenticated or may enter his/her new information to the system to get authenticated

Manage system: Admin has the authority to change the configuration and accounting of the system


