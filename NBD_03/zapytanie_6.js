printjson(db.people.insertOne(
	{
		"sex" : "Male",
		"first_name" : "Pawel",
		"last_name" : "Celejewski",
		"job" : "AWS Cloud Developer",
		"email" : "s15799@pjwstk.edu.pl",
		"location" : {
			"city" : "Warsaw",
			"address" : {
				"streetname" : "Koszykowa",
				"streetnumber" : "42"
			}
		},
		"description" : "NBD_03",
		"height" : "181.32",
		"weight" : "80.58",
		"birth_date" : "1992-11-07T00:47:12Z",
		"nationality" : "Poland",
		"credit" : [
			{
				"type" : "jcb",
				"number" : "3538118560561611",
				"currency" : "PLN",
				"balance" : "5080.43"
			}
		]
	}
))