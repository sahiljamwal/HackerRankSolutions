

    static boolean isAnagram(String a, String b) {
        // Complete the function

        a=a.toLowerCase();
        b=b.toLowerCase();

        int arra[]=new int[26];
        int arrb[]=new int[26];

        for(int i=0;i<a.length();i++)
        {
            arra[(int)a.charAt(i)-97]++;
        }

        for(int i=0;i<b.length();i++)
        {
            arrb[(int)b.charAt(i)-97]++;
        }

        int flag=0;
        for(int i=0;i<arra.length;i++)
        {
            if(arra[i]==arrb[i])
            {
                flag=0;
            }
            else
            {
                flag=-1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false; 

    }

