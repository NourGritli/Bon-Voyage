# Bon-Voyage
 “Bon Voyage team is trying to provide a high level models of the reservation/booking system to build reusable in different platforms, maintainable with low cost and self-explained software product line while adopting the best practices of Model- Driven software Development.”

# System description


Online reservation systems are one of the most trending systems that are widely used by different categories of clients. The real-time booking, the availability and the variety of services they provide are top features of their success. However, online reservation might sometimes not be practical as it seems to be.

For example, if we consider a real life scenario for booking a flight. Even if this task is supposed to last few minutes, generally a client may spend an hour surfing between the different online reservation systems of each company and comparing the offers. In this case, online reservation won’t be a very pleasant experience and there is no guarantee for the client that he chose the best or cheapest offer. Moreover, it is more practical for a client to book all the services from one platform such as booking a flight, renting a car and finding a hotel room for his stay.

In order to facilitate and reduce the time of online reservation task, we propose “Bon Voyage” which is an online reservation system (a website). The specificity of “Bon voyage” is giving access to a wide choice of flight companies, hotels and car renting agencies. Also, the reservation system we propose will be able to go through all the offers and only show the most interesting offers (in terms of discount/price). This way, the benchmarking task is no more done by the customer.


The main services that our system will provide for now are: Transport reservation/renting (e.g. flight reservation, car rental, etc.), Accommodation reservation (hotel room, etc.), Activities tickets (e.g. Concerts, museums). The list of the offered service might be extended as we go further in the project.


Once an internet user access “Bon Voyage” website there are three possible scenarios:

1.	It is the first time for the user to visit the website so he does not have an account yet. In this case, this user will be able to browse the website as an anonymous/unauthorized user so he will only be able to search for the available offers. This user won’t be able to make any reservation without signing up into the system.
2.	The internet user is already a customer, so he can choose to sign in with his registered credentials in order to operate the CRUD operations (e.g. edit his profile, view his profile or delete it, etc.) and/or search for offers and make reservation. The customer can choose to login only when he wants to make a reservation.
3.	The internet user is a system administrator.  After signing in, he is able to manage clients (e.g. add clients, delete clients, etc.) in addition to all the functionalities enabled for a normal customer.

“Bon Voyage” provides a catalog. Each catalog is a service. The offered services as aforementioned are:
 
-	Transport reservation 
-	Accommodation reservation
-	Activity reservation

First, the customer can select one of this services. The he can search for the services he wants by specifying the details that suits him the best. For example, when selecting “Transport reservation”, the customer can add the desired mean of transport, the date, the departure and the destination. Obviously, each service has it specific search filters. After the search details confirmation, the systems shows a list of the most pertinent offers in terms of discount. Once a customer is interested by an offer and he is ready to book, he selects the offer and makes a payment. If the payment is processed successfully, the customer receives his printable ticket or reservation confirmation via email (to be discussed!).  The customer is able to cancel the reservation before making the payment. Every canceling after the payment is related to the company policy.

