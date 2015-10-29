package com.nevinchen.myapplication.example

import java.util.*

fun swap(array: IntArray, a: Int, b: Int) {
    val temp = array[a]
    array[a] = array[b]
    array[b] = temp
}

fun insertionSort(array: IntArray) {
    for ((index, value) in array.withIndex()) {
        //        println("the element at $index is $value")
        var j = index

        while (j > 0 ) {
            // swap if smaller than sorted[j]
            if (array[j] < array[j - 1]) {
                swap(array, j, j - 1)
            }
            j--
        }

    }
}

fun selectionSort(a: IntArray) {

    if (a.size() < 1) {
        return
    }
    for (j in 0..a.size() - 1) {
        var minp = j

        for (i in j..a.size() - 1) {
            if (a[minp] > a[i]) {
                minp = i
            }
        }
        println("min started from $j is ${a[minp]} @ $minp")
        swap(a, j, minp)
    }


}


// ============== merge sort start ==============
var numbers: IntArray = intArrayOf()
var temp: IntArray = intArrayOf()

fun merge(low: Int, middle: Int, high: Int) {

    for (i in low..high) {
        temp[i] = numbers[i];
    }
    var i = low;
    var j = middle + 1;
    var k = low;
    while (i <= middle && j <= high) {
        if (temp[i] <= temp[j]) {
            numbers[k] = temp[i];
            i++;
        } else {
            numbers[k] = temp[j];
            j++;
        }
        k++;
    }
    while (i <= middle) {
        numbers[k] = temp[i];
        k++;
        i++;
    }

}

fun mergesortImpl(low: Int, high: Int) {
    if (low < high) {
        var mid: Int = low + (high - low) / 2;
        mergesortImpl(low, mid);
        mergesortImpl(mid + 1, high);
        merge(low, mid, high);
    }
}

fun mergetSort(a: IntArray) {

    numbers = a;
    temp = a.copyOf();
    mergesortImpl(0, a.size() - 1);

}
// ============== merge sort  end  ==============

// ============== Quick sort  start  20151015==============

fun quickSort(a: IntArray, lowOffset: Int, highOffset: Int) {

    if (lowOffset > highOffset ) return;

    // find pivot
    var pivot: Int = a[highOffset]
    var nextSmallTail = lowOffset;

    // partition
    for (i in lowOffset..highOffset - 1) {
        if ( a[i] <= pivot ) {
            swap(a, i, nextSmallTail)
            nextSmallTail++
        }
    }

    swap(a, nextSmallTail, highOffset)
    pivot = nextSmallTail

    quickSort(a, lowOffset, pivot - 1)
    quickSort(a, pivot + 1, highOffset)

}
// ============== Quick sort  end  20151015==============


fun main(args: Array<String>) {
    //    var array = intArrayOf( 6,5,4,3,2,1)
    //    array.forEach { i -> print(i) }
    //    println("")
    //    quickSort(array,0,array.size()-1)
    //    array.forEach { i -> print(i) }

    //    var b = Base("b")
    //    var d = Derived("d")


//    var d: ArrayList<Derived> = ArrayList<Derived>();
//    var b: ArrayList<in Base> = ArrayList<Base>()


//    print(b)

    //    list = ar
//    print(ar.toString())
//    foo(list)


}

fun foo(p: ArrayList<in Any>){
}
