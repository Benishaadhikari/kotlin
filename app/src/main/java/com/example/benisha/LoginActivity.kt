//package com.example.benisha
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.KeyboardArrowLeft
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.alpha
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.compose.ui.tooling.preview.Preview
//import org.w3c.dom.Text
//
//class LoginActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            Scaffold { innerPadding ->
//                LoginBody(innerPadding)
//            }
//        }
//    }
//}
//
//@Composable
//fun LoginBody(innerPadding: PaddingValues) {
//    Column(
//        modifier = Modifier
//            .padding(innerPadding)
//            .fillMaxSize()
//            .background(color = Color.White)
//    ) {
//        // Top Bar
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            // Back Icon
//            Icon(
//                imageVector = Icons.Default.KeyboardArrowLeft,
//                contentDescription = "Back",
//                tint = Color.Green,
//                modifier = Modifier
//                    .height(30.dp)
//                    .width(30.dp)
//            )
//
//            // Username
//            Text(
//                text = "Andrew",
//                style = TextStyle(
//                    fontStyle = FontStyle.Italic,
//                    fontSize = 18.sp,
//                )
//            )
//
//            // More Options Icon
//            Icon(
//                painter = painterResource(R.drawable.baseline_more_horiz_24),
//                contentDescription = "More",
//                tint = Color.Black,
//                modifier = Modifier
//                    .height(30.dp)
//                    .width(30.dp)
//            )
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Profile Info
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 16.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceEvenly
//
//        ) {
//
//            // Profile Picture
//            Image(
//                painter = painterResource(R.drawable.insta1),
//                contentDescription = "Profile Picture",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .size(100.dp)
//                    .clip(RoundedCornerShape(50.dp))
//            )
//
//            // Posts
//            Column(
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(text = "174", fontSize = 18.sp, fontStyle = FontStyle.Normal)
//                Text(text = "Posts", fontSize = 14.sp)
//            }
//
//            // Followers
//            Column(
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(text = "770k", fontSize = 18.sp, fontStyle = FontStyle.Normal)
//                Text(text = "Followers", fontSize = 14.sp)
//            }
//
//            // Following
//            Column(
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(text = "173", fontSize = 18.sp, fontStyle = FontStyle.Normal)
//                Text(text = "Following", fontSize = 14.sp)
//            }
//        }
//
//        Column(
//            modifier =
//                Modifier.padding(
//                    horizontal = 10.dp,
//                    vertical = 15.dp
//                )
//        ){
//            Text("Andrew Queo", style = TextStyle(
//                fontWeight = FontWeight.Bold,
//                color = Color.Red,
//                fontSize = 19.sp
//            )
//            )
//            Text("Artist", modifier = Modifier.alpha(0.5f))
//            Text("DESIGNER")
//            Text("isabella@art.design")
//            Text("Followed by jenna and anna")
//        }
//        Row{
//            Button(
//                onClick = {
//                    //user le button thiche paxi ke garne
//                    //to-do when clicked
//
//                },
//                shape = RoundedCornerShape(10.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color.Blue,
//                    contentColor = Color.White
//                )
//            ){
//                Text("Follow")
//            }
//        }
//
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewBody() {
//    LoginBody(innerPadding = PaddingValues(0.dp))
//}
