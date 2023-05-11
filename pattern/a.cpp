#include <iostream>

using namespace std;

int main(){
    //WAP to add and multiply two matrices of order nxn
    int m,n,arr[m][n],arr2[m][n],i,j,arr3[m][n];
    cout<<"Enter the no rows and colums of matrices:";
    cin>>m>>n;
    
    cout<<"Enter the elements of first matrice:"<<endl;
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            cin>>arr[i][j];
        }
    }
    
    cout<<"Enter the elements of second matrice:"<<endl;
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            cin>>arr2[i][j];
        }
    }
    
    cout<<"the sum of given two matrices is:"<<endl;
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            arr3[i][j]=arr[i][j] + arr2[i][j];
            cout<<arr3[i][j]<<" ";
        }
        cout<<endl;
    }
    
    

  return 0;
}