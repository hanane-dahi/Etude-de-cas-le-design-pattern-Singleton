# Etude-de-cas-le-design-pattern-Singleton 
L’objectif de cette étude de cas est d’introduire le design pattern Singleton à travers un exemple et de discuter et de bien comprendre son importance dans le développement logiciel. Pour ce faire, on a développé une solution orientée objet pour créer et manipuler des objets Terre caractérisés par un âge et un id qui sont tous les deux de type entier, avec des clients s’exécutant en séquentiel et avec des clients s’exécutant en parallèle. Ainsi, on a créé quatre classes dans le même package :

Pour le cas d’exécution séquentiel :
La classe Terre qui encapsule les propriétés (âge, id.) des objets à  créer et à manipuler ainsi que les opérations (créer, ajouter, afficher.) qu’ils offrent.
La classe Client pour créer et interagir avec des objets Terre.

Pour le cas d’exécution en parallèle :
La classe Terre2 qui encapsule les propriétés (âge, id.) des objets à  créer et à manipuler.il hérite les opérations (créer, ajouter, afficher.) de la classe Terre.
La classe Client2 pour créer et interagir avec des objets Terre.
