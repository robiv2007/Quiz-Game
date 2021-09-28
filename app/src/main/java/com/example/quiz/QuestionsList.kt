package com.example.quiz

object QuestionsList {
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()


        val question1 = Question(1,
            "Let's start the jurney from the busiest airport in Europe." +
                    "Which one do you think it is? ",
            R.drawable.airport,
            "Paris CDG",
            "London Heathrow" ,
            "Frankfurt Airport",
            "London Heathrow")

        questionsList.add(question1)


        val question2 = Question(2,
            "Next stop will be across the Atlantic ocean in the USA." +
                    " How many states have USA? ",
            R.drawable.map,
            "51",
            "49",
            "50",
            "50")

        questionsList.add(question2)

        val question3 = Question(3,
            "In what city is located the famous Alcatraz prison?",
            R.drawable.alcatraz,
            "Los Angeles",
            "San Francisco",
            "New York",
            "San Francisco")

        questionsList.add(question3)

        val question4 = Question(4,
            "Let's move a bit more south on the American continent" +
                    " What oceans is the Panama canal connecting?",
            R.drawable.panama,
            "Atlantic and Pacific",
            "Pacific and Indian ",
            "Atlantic and Arctic",
            "Atlantic and Pacific")

        questionsList.add(question4)

        val question5 = Question(5,
            "Welcome to beautiful Brazil." + " What is the capital city of Brazil?",
            R.drawable.brazil,
            "Brasilia",
            "Rio de Janeiro",
            "Sao Paulo",
            "Brasilia")

        questionsList.add(question5)

        val question6 = Question(6,
            "In the middle of the Pacific we find Hawaii." +
                    " What sport was invented in Hawaii?",
            R.drawable.honolulu,
            "Kite surf",
            "Surfing",
            "Softball",
            "Surfing")

        questionsList.add(question6)

        val question7 = Question(7,
            "From one paradise to another." + " To which country belongs this flag?",
            R.drawable.fiji,
            "Vanuatu",
            "New Caledonia",
            "Fiji",
            "Fiji")

        questionsList.add(question7)

        val question8 = Question(8,
            "Next stop is on the only continent and country at the same time." + " Which one is it?",
            R.drawable.maxresdefault,
            "Antarctica",
            "New Zeeland",
            "Australia",
            "Australia")

        questionsList.add(question8)

        val question9 = Question(9,
            "In what country was filmed The Lord of the Rings trilogy?",
            R.drawable.new_zeeland,
            "Island",
            "New Zeeland",
            "Ireland",
            "New Zeeland")

        questionsList.add(question9)

        val question10 = Question(10,
            "Last stop is in one of the greatest countries, Singapore." +
                    " Fun fact, what is forbidden in Singapore?",
            R.drawable.singapore,
            "chewing gum",
            "Facebook",
            "adult sites",
            "chewing gum")

        questionsList.add(question10)

        return questionsList
    }
}