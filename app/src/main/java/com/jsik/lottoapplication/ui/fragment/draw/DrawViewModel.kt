package com.jsik.lottoapplication.ui.fragment.draw

import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.jsik.lottoapplication.base.viewmodel.BaseViewModel
import com.orhanobut.logger.Logger

class DrawViewModel : BaseViewModel() {

  val myLottoList = MutableLiveData<ArrayList<Int>>()
  private val randomLottoList = ArrayList<Int>().apply {
    for (i in 1..45)
      add(i)
  }



  /**
   * 로또 번호 세팅하기 마지막에 하나 따로 더하는 건 보너스 번호는 소팅 안되게 하기 위함
   * */
  fun setLottoList() {
    randomLottoList.shuffle()
    myLottoList.value = arrayListOf<Int>().apply {
      addAll(randomLottoList.subList(0,6))
      sort()
      add(randomLottoList[6])
    }
  }

  /**
   * 파이어베이스 데이터 추가
   * */
  fun setData(){
    val db = Firebase.firestore


    // Create a new user with a first and last name
    val user = hashMapOf(
      "first" to "Ada",
      "last" to "Lovelace",
      "born" to 1815
    )

    // Add a new document with a generated ID
    db.collection("users")
      .add(user)
      .addOnSuccessListener { documentReference ->
        Logger.e("DocumentSnapshot added with ID: ${documentReference.id}")
      }
      .addOnFailureListener { e ->
        Logger.e("Error adding document", e)
      }

    // Create a new user with a first, middle, and last name
    val user2 = hashMapOf(
      "first" to "Alan",
      "middle" to "Mathison",
      "last" to "Turing",
      "born" to 1912
    )

    // Add a new document with a generated ID
    db.collection("users")
      .add(user2)
      .addOnSuccessListener { documentReference ->
        Logger.e("DocumentSnapshot added with ID: ${documentReference.id}")
      }
      .addOnFailureListener { e ->
        Logger.e("Error adding document", e)
      }
  }

  //
  fun getData(){

    val db = Firebase.firestore

    db.collection("users")
      .get()
      .addOnSuccessListener { result ->
        for (document in result) {
          Logger.e("${document.id} => ${document.data}")
        }
      }
      .addOnFailureListener { exception ->
        Logger.e("Error getting documents.", exception)
      }

  }
}