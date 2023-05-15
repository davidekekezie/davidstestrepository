def largest_value_returner(arr):
    maximum_num = arr[0]
    for i in range(len(arr)):
        if maximum_num < arr[i]:
            maximum_num = arr[i]
    return maximum_num


def array_reserve(**kwargs):
    arr = [kwargs]
    return arr


def element_checker(number, lst):
    for i in lst:
        if i == number:
            print("your character has been found in your array")
            break
        else:
            continue


def odd_position_printer(arr):
    counter = 0
    new_container = []
    while counter < len(arr):
        if counter % 2 == 1:
            new_container.append(arr[counter])
        counter += 1
    return new_container


def even_position_printer(arr):
    counter = 0
    new_container = []
    while counter < len(arr):
        if counter % 2 == 0:
            new_container.append(arr[counter])
    counter += 1

    return new_container


def total_of_list(arr):
    total = 0
    counter = 0
    while counter < len(arr):
        total += arr[counter]
        counter += 1

    return f"your total is {total}"


def palindrome_finder(word):
    word_backwards = word[::-1]
    if word_backwards == word:
        return "it is a palindrome"
    else:
        return "it is not a palindrome"


def list_joiner(arr1, arr2):
    joint_word = arr1+arr2
    return joint_word


def list_inter_changeable_joiner(arr1, arr2):
    length = len(arr1)+len(arr2)
    counter = 0
    lst = []
    counter_for1 = 0
    counter_for2 = 0
    while counter < length:
        if counter % 2 == 0:
            lst.append(arr1[counter_for1])
            counter_for1 += 1
        if counter % 2 == 1:
            lst.append(arr2[counter_for2])
            counter_for2 += 1


def number_array_creator(number):
    counter = 0
    lst = []
    while counter < len(number):
        lst.append(counter)
        counter += 1
    return lst
