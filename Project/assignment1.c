#include <stdio.h>
// Rule 1 :- Any array element having multiple occurrence of same value must be removed and only 1
void rule1(int *arr, int n)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] != -1)
        {
            for (int j = 0; j < n; j++)
            {
                if (arr[i] == arr[j] && (i != j))
                    arr[j] = -1;
            }
        }
    }
}

// rule 2:- All array elements must be a single digit number (1to 9) ifthere are multi digit numbers then a
// digit sum is performed on the digits till a single digit is reached
void rule2(int *arr, int n)
{

    for (int i = 0; i < n; i++)
    {
        if (arr[i] > 9)
        {
            while (arr[i] > 9)
            {
                int sum = 0,m;
                int k = arr[i];
                while (k > 0)
                {
                    m = k % 10;
                    sum = sum + m;
                    k = k / 10;
                }
                arr[i] = sum;
            }
        }
    }
    rule1(arr,n);
}

// Rule 3-The array elements will not comprise of element 0

void rule3(int *arr, int n){
    for(int i = 0; i < n; i++){
        if(arr[i] == 0)
            arr[i] = -1;
    }
}

// Rule 4- Any element in the array, if can be formedby adding any 2 elements in the same array must be removed.

void rule4(int *arr, int n){
    int temp_arr[n];
    for(int i = 0; i < n; i++)
        temp_arr[i] = arr[i];
    for(int i = 0; i < n; i++){
        if(temp_arr[i] != -1){
            for(int j = 0; j < n; j++){
                int sum = 0;
                if(temp_arr[j] != -1 && i!= j){
                    sum = temp_arr[i] + temp_arr[j];
                    for(int k = 0; k < n; k++){
                        if(temp_arr[k] == sum)
                            arr[k] = -1;
                    }
                }
            }
        }
    }
}

// rule 5 :- Any element in the array, if can be formed by squaring any other element in the same array must be removed.

void rule5(int *arr, int n){
    int temp_arr[n];
    for(int i = 0; i < n; i++)
        temp_arr[i] = arr[i];
    for(int i = 0; i < n; i++){
        if(temp_arr[i] != -1 && temp_arr[i] != 1){
            for(int j = 0; j < n; j++){
                if(temp_arr[j] != -1 && temp_arr[j] != 1){
                    if(temp_arr[j] * temp_arr[j] == temp_arr[i])
                    arr[i] = -1;
                }
            }
        }
    }
}
void main()
{
    int n;
    printf("Enter size of array");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements of array");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    // rule 1
    rule1(arr, n);
    // for(int i = 0; i < n; i++)
    //     printf("%d  ",arr[i]);
    //

    // rule2
    rule2(arr,n);

    // rule 3

    rule3(arr,n);

    printf("Printing the elements after rule 1 ,2 and 3\n");
    for(int i = 0; i < n; i++){
        if(arr[i] != -1)
            printf("%d ",arr[i]);
    }
    
    // rule4
    printf("\n");
    rule4(arr,n);
     for(int i = 0; i < n; i++){
        if(arr[i] != -1)
            printf("%d ",arr[i]);
    }
     printf("\n");
    // rule 5
    rule5(arr,n);
    
     for(int i = 0; i < n; i++){
        if(arr[i] != -1)
            printf("%d ",arr[i]);
    }

}
