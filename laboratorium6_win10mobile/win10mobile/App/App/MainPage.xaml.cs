using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=402352&clcid=0x409

namespace App
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class MainPage : Page
    {
        private static double val1;
        private static double val2;

        private static char mark;


        public MainPage()
        {
            this.InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            double zloty = 0.00;

            double crowns = Convert.ToDouble(crownEdit.Text);

            zloty = crowns * 0.167865582;

            var zlotyStr = String.Format("{0:0.00}", zloty);
            zlotyEdit.Text = zlotyStr;
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            string str = numEdit.Text;
            if (str != "")
                str += "1";
            else
                str = "1";
            numEdit.Text = str;
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            string str = numEdit.Text;
            if (str != "")
                str += "2";
            else
                str = "2";
            numEdit.Text = str;
        }

        private void Button_Click_3(object sender, RoutedEventArgs e)
        {
            string str = numEdit.Text;
            if (str != "")
                str += "3";
            else
                str = "3";
            numEdit.Text = str;
        }

        private void Button_Click_4(object sender, RoutedEventArgs e)
        {
            string str = numEdit.Text;
            if (str != "")
                str += "4";
            else
                str = "4";
            numEdit.Text = str;
        }

        private void Button_Click_5(object sender, RoutedEventArgs e)
        {
            string str = numEdit.Text;
            if (str != "")
                str += "5";
            else
                str = "5";
            numEdit.Text = str;
        }

        private void Button_Click_6(object sender, RoutedEventArgs e)
        {
            string str = numEdit.Text;
            if (str != "")
                str += "6";
            else
                str = "6";
            numEdit.Text = str;
        }

        private void Button_Click_7(object sender, RoutedEventArgs e)
        {
            numEdit.Text = "";
        }

        private void Button_Click_8(object sender, RoutedEventArgs e)
        {
            string str = numEdit.Text;
            if (str != "")
                str += "7";
            else
                str = "7";
            numEdit.Text = str;
        }

        private void Button_Click_9(object sender, RoutedEventArgs e)
        {
            string str = numEdit.Text;
            if (str != "")
                str += "8";
            else
                str = "8";
            numEdit.Text = str;
        }

        private void Button_Click_10(object sender, RoutedEventArgs e)
        {
            string str = numEdit.Text;
            if (str != "")
                str += "9";
            else
                str = "9";
            numEdit.Text = str;
        }

        private void Button_Click_11(object sender, RoutedEventArgs e)
        {
            string str = numEdit.Text;
            if (str != "")
                str += "0";
            else
                str = "0";
            numEdit.Text = str;
        }

        private void Button_Click_12(object sender, RoutedEventArgs e)
        {
            val1 = Convert.ToDouble(numEdit.Text);
            numEdit.Text = "";
            mark = '+';
        }

        private void Button_Click_13(object sender, RoutedEventArgs e)
        {
            val1 = Convert.ToDouble(numEdit.Text);
            numEdit.Text = "";
            mark = '-';
        }

        private void Button_Click_14(object sender, RoutedEventArgs e)
        {
            val1 = Convert.ToDouble(numEdit.Text);
            numEdit.Text = "";
            mark = '*';
        }

        private void Button_Click_15(object sender, RoutedEventArgs e)
        {
            val1 = Convert.ToDouble(numEdit.Text);
            numEdit.Text = "";
            mark = '/';
        }

        private void Button_Click_16(object sender, RoutedEventArgs e)
        {
            double result = 0;
            switch(mark)
            {
                case '+':
                    val2 = Convert.ToDouble(numEdit.Text);
                    result = val1 + val2;
                    break;
                case '-':
                    val2 = Convert.ToDouble(numEdit.Text);
                    result = val1 - val2;
                    break;
                case '*':
                    val2 = Convert.ToDouble(numEdit.Text);
                    result = val1 * val2;
                    break;
                case '/':
                    val2 = Convert.ToDouble(numEdit.Text);
                    result = val1 / val2;
                    break;
                default:
                    break;
            }
            if (mark == '+' || mark == '-')
                numEdit.Text = String.Format("{0:0}", result);
            else
                numEdit.Text = String.Format("{0:0.00}", result);

        }
    }
}
