
# Installing the project on Eclipse Papyrus:
  1. git clone https://github.com/NourGritli/Bon-Voyage.git on command line or just download ZIP from the github repository.
  2. On eclipse click on : file -> import ->existing project into workspace -> select the project folder .

NOTE : you should have Papyrus already installed. To do so : go to HELP -> Install new software -> copy the url of the papyrus  release update site related to your Eclipse version.


# Bon-Voyage
“Bon Voyage team is trying to provide a high level models of the reservation/booking system to build reusable in different platforms, maintainable with low cost and self-explained software product line while adopting the best practices of Model- Driven software Development.”


# System description

“Bon Voyage” is an online reservation system (a website). The specificity of “Bon voyage” is giving access to a wide choice of flight companies, hotels and car renting agencies. Also, the reservation system we propose will be able to go through all the offers and only show the most interesting offers (in terms of discount/price). The main services that our system will provide for now are:

•	Transport reservation/renting (e.g. flight reservation, car rental, etc.)

•	Accommodation reservation (hotel room, etc.)

•	Activities tickets (e.g. Concerts, museums)

The list of the offered service might be extended as we go further in the project.

“Bon Voyage” provides a catalog in which there is many type of services as aforementioned are:

•	Transport reservation

•	Accommodation reservation

•	Activity reservation

The online customer can select one of these services. Then, he/she can search for available offers by specifying the details that suit him/her the best. For example, when selecting “Transport reservation”, the customer can add the desired mean of transport, the desired date, the departure and the destination. Each service has its specific search filters. After the detailed search confirmation, the system shows a list of the most pertinent offers in order of the cheapest price.

Once a customer is interested in an offer he/she can select it and view its details if needed. After that,  he/she can reserve a service and has to sign in (if an account has been made, otherwise he/she has to sign up) to make the payment for the reserved service. If the payment is processed successfully, the customer receives his printable ticket or reservation confirmation. The customer is able to edit or cancel the reservation before making the payment. Each cancelation after successful payment has to be made in accordance to its company/supplier policy.

# Functional requirements

Search: clients search for desired service and the query will be send to suppliers API and the responds will be sent back and be displayed to clients.

Edit reservation(item): client can change the details of the selected time

Make a payment: an authenticated client may make a payment to reserve the selected item and Bank send the transaction confirmation to system.

Authenticate(authenticating): client may use his/her previous registered information to become authenticated or may enter his/her new information to the system to get authenticated

Manage system: Admin has the authority to change the configuration and accounting of the system
