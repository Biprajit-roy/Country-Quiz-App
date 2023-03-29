package com.example.countryquiz

import java.util.ArrayList

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestion():ArrayList<Question>{
        val questionList=ArrayList<Question>()
        //1
        val Ques1=Question(
            1,"Which contry does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Monaco","Argentina",
            "Poland","Sweden",
            2
        )
        questionList.add(Ques1)

        //2
        val Ques2=Question(
            2,"Which contry does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Australia","New Zealand",
            "Canada","Norway",
            1
        )
        questionList.add(Ques2)

        //3
        val Ques3=Question(
            3,"Which contry does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Mexico","Thailand",
            "Belgium","Argentina",
            3
        )
        questionList.add(Ques3)

        //4
        val Ques4=Question(
            4,"Which contry does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Bolivia","Brazil",
            "Australia","Austria",
            2
        )
        questionList.add(Ques4)

        //5
        val Ques5=Question(
            5,"Which contry does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Norway","Portugal",
            "Serbia","Denmark",
            4
        )
        questionList.add(Ques5)

        //6
        val Ques6=Question(
            6,"Which contry does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji","Chile",
            "Mayanmar","Yemen",
            1
        )
        questionList.add(Ques6)

        //7
        val Ques7=Question(
            7,"Which contry does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Mauritius","Venezuela",
            "Vietnam","Germany",
            4
        )
        questionList.add(Ques7)

        //8
        val Ques8=Question(
            8,"Which contry does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Laos","Bhutan",
            "India","Crotia",
            3
        )
        questionList.add(Ques8)

        //9
        val Ques9=Question(
            9,"Which contry does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Nigeria","Colombia",
            "Kuwait","Ireland",
            3
        )
        questionList.add(Ques9)

        //10
        val Ques10=Question(
            10,"Which contry does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand","Maldives",
            "Egypt","Bulgaria",
            1
        )
        questionList.add(Ques10)

        return questionList
    }


}