#include <iostream>
#include <fstream>
#include <stack>
#include <string>
using namespace std;

bool ArePair(char opening,char closing) {

	if (opening == '(' && closing == ')') return true;
	else if (opening == '{' && closing == '}') return true;
	else if (opening == '[' && closing == ']') return true;
	return false;
}

bool AreParanthesesBalanced(string exp) {

	stack<char> S;
	for (int i = 0; i < exp.length(); i++) {
		if (exp[i] == '(' || exp[i] == '{' || exp[i] == '[')
			S.push(exp[i]);
		else if (exp[i] == ')' || exp[i] == '}' || exp[i] == ']') {
			if (S.empty() || !ArePair(S.top(), exp[i]))
				return false;
			else
				S.pop();
		}
	}
	return S.empty() ? true : false;
}

int main(int argc, const char *argv[]) {
  string line;
  ifstream myfile ("file.txt");
  if (myfile.is_open()) {

    while ( myfile.good() ) {
      getline (myfile,line);
      cout << line << endl;
    }
    if(AreParanthesesBalanced(line))
	    cout<<"Correct\n";
	else
		cout<<"Not Correct\n";

    myfile.close();
  }

  else cout << "Unable to open file"; 

  return 0;
}
